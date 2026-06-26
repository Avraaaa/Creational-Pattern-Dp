package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.Question;
import questions.core.QuestionFactory;

public class PracticeQuiz implements Exam {
    private ExamConfiguration configuration;
    private List<QuestionFactory> questionFactories;
    private String sourcingStrategy;

    public PracticeQuiz(ExamConfiguration configuration, List<QuestionFactory> questionFactories, String sourcingStrategy) {
        this.configuration = configuration;
        this.questionFactories = questionFactories;
        this.sourcingStrategy = sourcingStrategy;
    }

    public String getType() {
        return "Practice Quiz";
    }

    public void displayInfo() {
        System.out.println("=========================================");
        System.out.println("PRACTICE QUIZ CREATED (Low Stakes / Unlimited Attempts)");
        System.out.println("=========================================");
        System.out.println("Title: " + this.configuration.getTitle());
        System.out.println("Duration: " + this.configuration.getDuration() + " minutes");

        System.out.println("Compiled Structural Components:");
        for (QuestionFactory factory : this.questionFactories) {
            Question question = factory.createQuestion();
            System.out.println("- [Type: " + question.getType() + "] Points: " + question.getPoints());
        }
        System.out.println("=========================================");
    }
}