package Project.service;

import Project.model.InputData;
import Project.model.Overpayment;
import Project.model.Rate;
import Project.model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConstantAmountsCalculationService implements IConstantAmountsCalculationService{

        @Override
        public RateAmounts calculateConstantRate(InputData inputData, Overpayment overpayment) {
        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal residualAmount = inputData.getAmount();

        BigDecimal q = calculateQ(interestPercent);

        BigDecimal rateAmount = calculateConstantRateAmount(q, inputData.getAmount(), inputData.getMonthsDuration());
        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }
        @Override
        public RateAmounts calculateConstantRate(InputData inputData, Overpayment overpayment, Rate previousRate) {
        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();

        BigDecimal q = calculateQ(interestPercent);

        BigDecimal rateAmount = calculateConstantRateAmount(q, inputData.getAmount(), inputData.getMonthsDuration());
        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount);

        return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
    }

    private BigDecimal calculateConstantRateAmount(BigDecimal q, BigDecimal amount, BigDecimal monthsDuration) {
        return amount
                .multiply(q.pow(monthsDuration.intValue()))
                .multiply(q.subtract(BigDecimal.ONE))
                .divide(q.pow(monthsDuration.intValue()).subtract(BigDecimal.ONE), 50, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateConstantCapitalAmount(BigDecimal rateAmount, BigDecimal interestAmount) {
        return rateAmount.subtract(interestAmount);
    }

    private BigDecimal calculateQ(BigDecimal interestPercent) {

        return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
    }

}
