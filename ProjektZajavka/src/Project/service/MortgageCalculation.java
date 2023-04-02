package Project.service;

import Project.model.InputData;
import Project.model.Rate;

import java.util.List;

public class MortgageCalculation implements IMortgageCalculationService {

    private final IPrintingService IPrintingService;

    private final IRateCalculationService IRateCalculationService;

    public MortgageCalculation(
            IPrintingService IPrintingService,
            IRateCalculationService IRateCalculationService
    ) {
        this.IPrintingService = IPrintingService;
        this.IRateCalculationService = IRateCalculationService;
    }


    @Override
    public void calculate(InputData inputData) {
        IPrintingService.printInputDateInfo(inputData);

        List<Rate> rates = IRateCalculationService.calculate(inputData);
    }


}
