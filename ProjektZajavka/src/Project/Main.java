package Project;

import Project.model.*;
import Project.service.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(360))
                .withRateType(RateType.CONSTANT);


        IPrintingService printingService = new PrintingService();
        IRateCalculationService rateCalculationService = new RateCalculationService(
                new TimePointService(),
                new AmountsCalculationService(),
                new OverpaymentCalculationService(),
                new ResidualCalculationService(),
                new ReferenceCalculationService()
        );
        IMortgageCalculationService mortgageCalculationService = new MortgageCalculation(
                printingService,
                rateCalculationService,
                SummaryServiceFactory.create()
        );
        mortgageCalculationService.calculate(inputData);
    }
}