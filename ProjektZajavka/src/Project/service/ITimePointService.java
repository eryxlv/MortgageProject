package Project.service;

import Project.model.InputData;
import Project.model.TimePoint;

import java.math.BigDecimal;

public interface ITimePointService {
    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
