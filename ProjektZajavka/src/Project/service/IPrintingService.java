package Project.service;

import Project.model.InputData;

public interface IPrintingService {

    String INTEREST_SUM = "SUMA ODSETEK ";
    String RATE_NUMBER = "NR:  ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String DATE = "DATA: ";
    String MONTHS = " MIESIECY ";
    String RATE = "RATA: ";
    String INTEREST = "OPROCENTOWANIE: ";
    String CAPITAL = "KAPITAL: ";
    String LEFT = "POZOSTALO: ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREYDOTOWANIA: ";

    String CURRENCY = " ZL ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";


    void printInputDateInfo(final InputData inputData);
}
