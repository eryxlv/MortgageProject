package Project.service;

import Project.model.InputData;
import Project.model.Overpayment;
import Project.model.Rate;
import Project.model.RateAmounts;

public interface IConstantAmountsCalculationService {


    RateAmounts calculateConstantRate(InputData inputData, Overpayment overpayment);

    RateAmounts calculateConstantRate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
