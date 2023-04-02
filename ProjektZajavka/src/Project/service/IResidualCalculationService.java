package Project.service;

import Project.model.InputData;
import Project.model.MortgageResidual;
import Project.model.Rate;
import Project.model.RateAmounts;

public interface IResidualCalculationService {
    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);
}
