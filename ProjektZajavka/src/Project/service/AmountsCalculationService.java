package Project.service;

import Project.model.InputData;
import Project.model.Rate;
import Project.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData);

    RateAmounts calculate(InputData inputData, Rate previousRate);
}
