package Project.service;

import Project.model.InputData;
import Project.model.Rate;
import Project.model.Summary;

import java.util.List;

public interface IPrintingService {

    String INTEREST_SUM = "SUMA ODSETEK ";
    String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADPLATY: ";
    String LOSTS_SUM = "SUMA STRAT: ";
    String OVERPAYMENT_REDUCE_RATE = "NADPLATA, ZMIEJSZENIE RATY";
    String OVERPAYMENT_REDUCE_PERIOD = "NADPLATA, SKROCENIE OKRESU";
    String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADPLAT: ";
    String RATE_NUMBER = "NR:  ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String DATE = "DATA: ";
    String MONTHS = " MIESIECY ";
    String RATE = "RATA: ";
    String INTEREST = "ODSETKI: ";
    String CAPITAL = "KAPITAL: ";
    String OVERPAYMENT = "NADPLATA: ";
    String LEFT_AMOUNT = "POZOSTALA KWOTA: ";
    String LEFT_MONTHS = "POZOSTALO MIESIECY: ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREYDOTOWANIA: ";

    String CURRENCY = " ZL ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";


    void printInputDateInfo(final InputData inputData);

    void printRates(List<Rate> rates);

    void printSummary(Summary summary);
}
