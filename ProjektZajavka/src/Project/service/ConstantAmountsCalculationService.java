package Project.service;

import Project.model.InputData;
import Project.model.Overpayment;
import Project.model.Rate;
import Project.model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConstantAmountsCalculationService extends AMethodsForAmountsCalculation implements IConstantAmountsCalculationService {

    @Override
    public RateAmounts calculate(InputData inputData, Overpayment overpayment) {
        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal q = calculateQ(interestPercent);

        BigDecimal residualAmount = inputData.getAmount();
        BigDecimal referenceAmount = inputData.getAmount();
        BigDecimal referenceDuration = inputData.getMonthsDuration();


        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal rateAmount = calculateConstantRateAmount(q, referenceAmount, referenceDuration, interestAmount, residualAmount);
        BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount, residualAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

    @Override
    public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {
        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal q = calculateQ(interestPercent);

        BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();
        BigDecimal referenceAmount = inputData.getAmount();
        BigDecimal referenceDuration = inputData.getMonthsDuration();


        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal rateAmount = calculateConstantRateAmount(
                q, referenceAmount, referenceDuration, interestAmount, residualAmount);
        BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount, residualAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

    private BigDecimal calculateConstantRateAmount(
            BigDecimal q,
            BigDecimal amount,
            BigDecimal monthsDuration,
            BigDecimal interestAmount,
            BigDecimal residualAmount
    ) {
        BigDecimal rateAmount = amount
                .multiply(q.pow(monthsDuration.intValue()))
                .multiply(q.subtract(BigDecimal.ONE))
                .divide(q.pow(monthsDuration.intValue()).subtract(BigDecimal.ONE), 50, RoundingMode.HALF_UP);

        return compareWithResidual(rateAmount, interestAmount, residualAmount);
    }

    private BigDecimal calculateQ(BigDecimal interestPercent) {

        return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
    }

    private BigDecimal compareWithResidual(
            BigDecimal rateAmount,
            BigDecimal interestAmount,
            BigDecimal residualAmount
    ) {
        if (rateAmount.subtract(interestAmount).compareTo(residualAmount) >= 0) {
            return residualAmount.add(interestAmount);
        }
        return rateAmount;
    }

    private BigDecimal calculateConstantCapitalAmount(
            BigDecimal rateAmount,
            BigDecimal interestAmount,
            BigDecimal residualAmount
    ) {
        BigDecimal capitalAmount = rateAmount.subtract(interestAmount);
        if (capitalAmount.compareTo(residualAmount) >= 0) {
            return residualAmount;
        }

        return capitalAmount;
    }

}
