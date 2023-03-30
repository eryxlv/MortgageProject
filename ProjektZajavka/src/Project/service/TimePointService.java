package Project.service;

import Project.model.InputData;
import Project.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {
    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
