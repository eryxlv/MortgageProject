package Project.service;

import Project.model.InputData;
import Project.model.Rate;

import java.util.List;

public interface IPrintingService {

    String INTEREST_SUM = "SUMA ODSETEK ";
    String RATE_NUMBER = "NR:  ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String DATE = "DATA: ";
    String MONTHS = " MIESIECY ";
    String RATE = "RATA: ";
    String INTEREST = "ODSETKI: ";
    String CAPITAL = "KAPITAL: ";
    String LEFT_AMOUNT = "POZOSTALA KWOTA: ";
    String LEFT_MONTHS = "POZOSTALO MIESIECY: ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREYDOTOWANIA: ";

    String CURRENCY = " ZL ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";


    void printInputDateInfo(final InputData inputData);

    void printRates(List<Rate> rates);
}
