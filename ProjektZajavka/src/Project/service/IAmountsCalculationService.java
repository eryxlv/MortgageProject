package Project.service;

import Project.model.InputData;
import Project.model.Rate;
import Project.model.RateAmounts;

public interface IAmountsCalculationService {
    RateAmounts calculate(InputData inputData);

    RateAmounts calculate(InputData inputData, Rate previousRate);
}
