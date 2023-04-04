package Project.service;

import Project.model.Rate;
import Project.model.Summary;

import java.util.List;

public interface ISummaryService {
    Summary calculate(List<Rate> rates);
}
