package Project.service;

import Project.model.InputData;
import Project.model.MortgageReference;
import Project.model.Rate;

public class ReferenceCalculationService implements IReferenceCalculationService{

    @Override
    public MortgageReference calculate(InputData inputData) {
        return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
    }

}
