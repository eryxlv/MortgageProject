package Project.service;

import Project.model.*;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationService implements IRateCalculationService {

    private final ITimePointService ITimePointService;

    private final IAmountsCalculationService IAmountsCalculationService;

    private final IResidualCalculationService IResidualCalculationService;

    public RateCalculationService(
            ITimePointService ITimePointService,
            IAmountsCalculationService IAmountsCalculationService,
            IResidualCalculationService IResidualCalculationService
    ) {
        this.ITimePointService = ITimePointService;
        this.IAmountsCalculationService = IAmountsCalculationService;
        this.IResidualCalculationService = IResidualCalculationService;
    }

    @Override
    public List<Rate> calculate(InputData inputData) {
        List<Rate> rates = new LinkedList<>();

        BigDecimal rateNumber = BigDecimal.ONE;

        Rate firstRate = calculateRate(rateNumber, inputData);
        rates.add(firstRate);

        Rate previousRate = firstRate;

        for (
                BigDecimal input = rateNumber.add(BigDecimal.ONE);
                input.compareTo(inputData.getMonthsDuration()) <= 0;
                input = input.add(BigDecimal.ONE)
        ) {
            Rate nextRate = calculateRate(input, inputData, previousRate);
            rates.add(nextRate);
            previousRate = nextRate;
        }

        return rates;
    }

    private Rate calculateRate(BigDecimal rateNumber, InputData inputData) {
        TimePoint timePoint = ITimePointService.calculate(rateNumber, inputData);
        RateAmounts rateAmounts = IAmountsCalculationService.calculate(inputData);
        MortgageResidual mortgageResidual = IResidualCalculationService.calculate(rateAmounts, inputData);

        return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual);
    }

    private Rate calculateRate(BigDecimal rateNumber, InputData inputData, Rate previousRate) {
        TimePoint timePoint = ITimePointService.calculate(rateNumber, inputData);
        RateAmounts rateAmounts = IAmountsCalculationService.calculate(inputData, previousRate);
        MortgageResidual mortgageResidual = IResidualCalculationService.calculate(rateAmounts, previousRate);

        return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual);
    }
}
