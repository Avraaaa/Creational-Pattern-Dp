package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.Question;
import questions.core.QuestionFactory;

public class FinalExam implements Exam {
    private ExamConfiguration configuration;
    private List<QuestionFactory> questionFactories;
    private String sourcingStrategy;

    public FinalExam(ExamConfiguration configuration, List<QuestionFactory> questionFactories, String sourcingStrategy) {
        this.configuration = configuration;
        this.questionFactories = questionFactories;
        this.sourcingStrategy = sourcingStrategy;
    }

    public String getType() {
        return "Final Exam";
    }

    public void displayInfo() {
        System.out.println("=========================================");
        System.out.println("FINAL EXAM CREATED (High Stakes / Maximum Security)");
        System.out.println("=========================================");
        System.out.println("Title: " + this.configuration.getTitle());
        System.out.println("Passing Score: " + this.configuration.getPassingScore() + " Marks");

        if (this.configuration.hasAutoSubmit()) {
            System.out.println("✓ Auto-Submit On Timeout is locked and active.");
        }

        System.out.println("Compiled Structural Components:");
        for (QuestionFactory factory : this.questionFactories) {
            Question question = factory.createQuestion();
            System.out.println("- [Type: " + question.getType() + "] Points: " + question.getPoints() + " Difficulty: " + question.getDifficulty());
        }
        System.out.println("=========================================");
    }
}