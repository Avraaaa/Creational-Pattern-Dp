package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.QuestionFactory;

public class MidtermExamFactory extends ExamFactory {
    public Exam createExam(ExamConfiguration config, List<QuestionFactory> questionFactories, String sourcingStrategy) {
        return new MidtermExam(config, questionFactories, sourcingStrategy);
    }
}