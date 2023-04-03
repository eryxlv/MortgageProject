package Project;

import Project.model.*;
import Project.service.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"));


        IPrintingService printingService = new PrintingService();
        IRateCalculationService rateCalculationService = new RateCalculationService(
                new TimePointService(),
                new AmountsCalculationService(),
                new ResidualCalculationService()
        );
        IMortgageCalculationService mortgageCalculationService = new MortgageCalculation(
                printingService,
                rateCalculationService
        );
        mortgageCalculationService.calculate(inputData);
    }
}