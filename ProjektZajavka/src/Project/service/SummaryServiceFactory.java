package Project.service;

import Project.model.Rate;
import Project.model.Summary;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

public class SummaryServiceFactory {
    public static ISummaryService create() {
        return rates -> {
            BigDecimal interestSum = calculate(
                    rates,
                    rate -> rate.getRateAmounts().getInterestAmount());
            BigDecimal provisions = calculate(
                    rates,
                    rate -> rate.getRateAmounts().getOverpayment().getProvisionAmount());
            BigDecimal totalLosts = interestSum.add(provisions);
            return new Summary(interestSum, provisions, totalLosts);
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
