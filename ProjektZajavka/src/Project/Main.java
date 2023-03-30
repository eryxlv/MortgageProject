package Project;

import Project.model.*;
import Project.service.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(new BigDecimal("160"));


        PrintingService printingService = new PrintingServiceImplementation();
        RateCalculationService rateCalculationService = new RateCalculationServiceImplementation(
                new TimePointServiceImplementation(),
                new AmountsCalculationServiceImplementation(),
                new ResidualCalculationServiceImplementation()
        );
        MortgageCalculationService mortgageCalculationService = new MortgageCalculationImplementation(
                printingService,
                rateCalculationService
        );
        mortgageCalculationService.calculate(inputData);
    }
}