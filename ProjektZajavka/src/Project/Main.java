package Project;

import Project.model.InputData;
import Project.model.service.PrintingService;
import Project.model.service.PrintingServiceImplementation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(new BigDecimal("160"));

        PrintingService printingService = new PrintingServiceImplementation();
        printingService.printInputDateInfo(inputData);
    }
}