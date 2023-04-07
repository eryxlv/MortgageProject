package Project.service;

import Project.model.Rate;
import Project.model.Summary;

import java.math.BigDecimal;
import java.util.List;

public class SummaryServiceFactory {
    public static ISummaryService create() {
        return rates -> {
            BigDecimal interestSum = calculate(
                    rates,
                    rate -> rate.getRateAmounts().getInterestAmount());

            BigDecimal provisions = calculate(
                    rates,
                    rate -> rate.getRateAmounts().getOverpayment().getProvisionAmount());

            BigDecimal totalLost = interestSum.add(provisions);

            return new Summary(interestSum, provisions, totalLost);
        };
    }

    private static BigDecimal calculate(List<Rate> rates, IFunction function) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Rate rate : rates) {
            sum = sum.add(function.calculate(rate));
        }
        return sum;
    }

}
