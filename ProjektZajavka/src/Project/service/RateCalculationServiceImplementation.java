package Project.service;

import Project.model.InputData;
import Project.model.Rate;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceImplementation implements RateCalculationService {

    @Override
    public List<Rate> calculate(InputData inputData) {
        List<Rate> rates = new LinkedList<>();

        BigDecimal rateNumber = BigDecimal.ONE;

        Rate firstRate = calculateFirstRate(rateNumber, inputData);
        rates.add(firstRate);

        Rate previousRate = firstRate;

        for (
                BigDecimal input = rateNumber.add(BigDecimal.ONE);
                input.compareTo(inputData.getMonthsDuration()) <= 0;
                input = input.add(BigDecimal.ONE)
        ) {
            Rate nextRate = calculateNextRate(input, inputData, previousRate);
            rates.add(nextRate);
            previousRate = nextRate;
        }

        return rates;
    }

    private Rate calculateFirstRate(BigDecimal rateNumber, InputData inputData) {
        return null;
    }

    private Rate calculateNextRate(BigDecimal input, InputData inputData, Rate previousRate) {
        return null;
    }
}
