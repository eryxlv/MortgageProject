package Project.service;

import Project.model.InputData;
import Project.model.MortgageReference;
import Project.model.Rate;

public interface IReferenceCalculationService {

    MortgageReference calculate(InputData inputData);

}
