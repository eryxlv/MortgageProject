package Project.service;

import Project.model.InputData;
import Project.model.Rate;

import java.util.List;

public class MortgageCalculationImplementation implements MortgageCalculationService {

    private final PrintingService printingService;

    private final RateCalculationService rateCalculationService;

    public MortgageCalculationImplementation(
            PrintingService printingService,
            RateCalculationService rateCalculationService
    ) {
        this.printingService = printingService;
        this.rateCalculationService = rateCalculationService;
    }


    @Override
    public void calculate(InputData inputData) {
        printingService.printInputDateInfo(inputData);

        List<Rate> rates = rateCalculationService.calculate(inputData);
    }


}
