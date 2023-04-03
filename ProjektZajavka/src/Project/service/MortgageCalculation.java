package Project.service;

import Project.model.InputData;
import Project.model.Rate;

import java.util.List;

public class MortgageCalculation implements IMortgageCalculationService {

    private final IPrintingService printingService;

    private final IRateCalculationService rateCalculationService;

    public MortgageCalculation(
            IPrintingService printingService,
            IRateCalculationService rateCalculationService
    ) {
        this.printingService = printingService;
        this.rateCalculationService = rateCalculationService;
    }


    @Override
    public void calculate(InputData inputData) {
        printingService.printInputDateInfo(inputData);

        List<Rate> rates = rateCalculationService.calculate(inputData);

        printingService.printRates(rates);
    }


}
