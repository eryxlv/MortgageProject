package Project.service;

import Project.model.InputData;
import Project.model.Overpayment;
import Project.model.Rate;
import Project.model.RateAmounts;

public interface IDecreasingAmountsCalculationService {

    RateAmounts calculateDecreasingRate(InputData inputData, Overpayment overpayment);

    RateAmounts calculateDecreasingRate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
