package Project.service;

import Project.model.InputData;
import Project.model.Overpayment;

import java.math.BigDecimal;

public interface IOverpaymentCalculationService {

    Overpayment calculate(BigDecimal rateNumber, InputData inputData);

}
