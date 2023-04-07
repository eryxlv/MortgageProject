package Project.service;

import Project.model.InputData;
import Project.model.MortgageReference;
import Project.model.Rate;
import Project.model.RateAmounts;

public interface IReferenceCalculationService {

    MortgageReference calculate(InputData inputData);

    MortgageReference calculate(InputData inputData, RateAmounts rateAmounts, Rate previousRate);
}
