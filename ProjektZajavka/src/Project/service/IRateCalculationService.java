package Project.service;

import Project.model.InputData;
import Project.model.Rate;

import java.util.List;

public interface IRateCalculationService {
    List<Rate> calculate(final InputData inputData);
}
