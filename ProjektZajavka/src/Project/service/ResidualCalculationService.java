package Project.service;

import Project.model.InputData;
import Project.model.MortgageResidual;
import Project.model.Rate;
import Project.model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationService implements IResidualCalculationService {
    @Override
    public MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData) {
        BigDecimal residualAmount = inputData.getAmount().subtract(rateAmounts.getCapitalAmount());
        BigDecimal residualDuration = inputData.getMonthsDuration().subtract(BigDecimal.ONE);

        return new MortgageResidual(residualAmount, residualDuration);
    }

    @Override
    public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate) {
        MortgageResidual residual = previousRate.getMortgageResidual();

        BigDecimal residualAmount = residual.getAmount().subtract(rateAmounts.getRateAmount());
        BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);

        return new MortgageResidual(residualAmount, residualDuration);
    }
}
