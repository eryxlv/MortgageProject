package Project.service;

import Project.model.Rate;

import java.math.BigDecimal;

public interface IFunction {
    BigDecimal calculate(Rate rate);
}
