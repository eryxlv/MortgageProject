package Project.service;

import Project.model.InputData;
import Project.model.Overpayment;
import Project.model.Rate;
import Project.model.RateAmounts;

public class AmountsCalculationService implements IAmountsCalculationService {

    private final ConstantAmountsCalculationService constantAmountsCalculationService;

    private final DecreasingAmountsCalculationService decreasingAmountsCalculationService;

    public AmountsCalculationService(
            ConstantAmountsCalculationService constantAmountsCalculationService,
            DecreasingAmountsCalculationService decreasingAmountsCalculationService
    ) {
        this.constantAmountsCalculationService = constantAmountsCalculationService;
        this.decreasingAmountsCalculationService = decreasingAmountsCalculationService;
    }

    @Override
    public RateAmounts calculate(InputData inputData, Overpayment overpayment) {
        switch (inputData.getRateType()) {
            case CONSTANT:
                return constantAmountsCalculationService.calculate(inputData, overpayment);
            case DECREASING:
                return decreasingAmountsCalculationService.calculate(inputData, overpayment);
            default:
                throw new MortgageException();
        }
    }

    @Override
    public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {
        switch (inputData.getRateType()) {
            case CONSTANT:
                return constantAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            case DECREASING:
                return decreasingAmountsCalculationService.calculate(inputData, overpayment, previousRate);
            default:
                throw new MortgageException();
        }
    }


}
