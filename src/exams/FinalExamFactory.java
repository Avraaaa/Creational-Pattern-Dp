package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.QuestionFactory;

public class FinalExamFactory extends ExamFactory {
    public Exam createExam(ExamConfiguration config, List<QuestionFactory> questionFactories, String sourcingStrategy) {
        return new FinalExam(config, questionFactories, sourcingStrategy);
    }
}