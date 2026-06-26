package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.QuestionFactory;

public abstract class ExamFactory {
    public abstract Exam createExam(ExamConfiguration config, List<QuestionFactory> questionFactories, String sourcingStrategy);
}