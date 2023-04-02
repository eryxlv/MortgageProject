package Project.service;

import Project.model.InputData;

public class PrintingService implements IPrintingService {

    @Override
    public void printInputDateInfo(InputData inputData) {
        StringBuilder msg = new StringBuilder(NEW_LINE);
        msg.append(MORTGAGE_AMOUNT).append(inputData.getAmount()).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(MORTGAGE_PERIOD).append(inputData.getMonthsDuration()).append(MONTHS);
        msg.append(NEW_LINE);
        msg.append(INTEREST).append(inputData.getInterestDisplay()).append(PERCENT);
        msg.append(NEW_LINE);

        printMessage(msg);
    }

    private void printMessage(StringBuilder sb) {
        System.out.println(sb);
    }

}
