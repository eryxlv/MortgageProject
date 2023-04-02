package Project;

import Project.model.*;
import Project.service.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"));


        IPrintingService IPrintingService = new PrintingService();
        IRateCalculationService IRateCalculationService = new RateCalculationService(
                new TimePointService(),
                new AmountsCalculationService(),
                new ResidualCalculationService()
        );
        IMortgageCalculationService IMortgageCalculationService = new MortgageCalculation(
                IPrintingService,
                IRateCalculationService
        );
        IMortgageCalculationService.calculate(inputData);
    }
}