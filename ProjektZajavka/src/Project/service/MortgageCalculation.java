package Project.service;

import Project.model.InputData;
import Project.model.Rate;
import Project.model.Summary;

import java.util.List;

public class MortgageCalculation implements IMortgageCalculationService {

    private final IPrintingService printingService;

    private final IRateCalculationService rateCalculationService;

    private final ISummaryService summaryService;

    public MortgageCalculation(
            IPrintingService printingService,
            IRateCalculationService rateCalculationService,
            ISummaryService summaryService) {
        this.printingService = printingService;
        this.rateCalculationService = rateCalculationService;
        this.summaryService = summaryService;
    }


    @Override
    public void calculate(InputData inputData) {
        printingService.printInputDateInfo(inputData);

        List<Rate> rates = rateCalculationService.calculate(inputData);

        Summary summary = summaryService.calculate(rates);
        printingService.printSummary(summary);

        printingService.printRates(rates);
    }


}
