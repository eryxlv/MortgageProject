package Project.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AMethodsForAmountsCalculation {

    protected static final BigDecimal YEAR = new BigDecimal("12");

    protected BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
        return residualAmount.multiply(interestPercent).divide(YEAR, 50, RoundingMode.HALF_UP);
    }

}
