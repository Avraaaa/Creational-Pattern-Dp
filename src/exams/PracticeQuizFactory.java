package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.QuestionFactory;

public class PracticeQuizFactory extends ExamFactory {
    public Exam createExam(ExamConfiguration config, List<QuestionFactory> questionFactories, String sourcingStrategy) {
        return new PracticeQuiz(config, questionFactories, sourcingStrategy);
    }
}