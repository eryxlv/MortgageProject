package Project.service;

import Project.model.InputData;
import Project.model.TimePoint;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimePointService implements ITimePointService {

    private static final BigDecimal YEAR = new BigDecimal("12");

    @Override
    public TimePoint calculate(BigDecimal rateNumber, InputData inputData) {

        LocalDate date = calculateDate(rateNumber, inputData);
        BigDecimal year = calculateYear(rateNumber);
        BigDecimal month = calculateMonth(rateNumber);

        return new TimePoint(date, year, month);
    }

    private LocalDate calculateDate(BigDecimal rateNumber, InputData inputData) {
        return inputData.getRepaymentStartDate()
                .plus(rateNumber.subtract(BigDecimal.ONE).intValue(), ChronoUnit.MONTHS);
    }

    private BigDecimal calculateYear(final BigDecimal rateNumber) {
        return rateNumber.divide(YEAR, RoundingMode.UP).max(BigDecimal.ONE);
    }

    private BigDecimal calculateMonth(final BigDecimal rateNumber) {
        return BigDecimal.ZERO.equals(rateNumber.remainder(YEAR)) ? YEAR : rateNumber.remainder(YEAR);
    }



}
