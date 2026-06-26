package exams;

import config.ExamConfiguration;
import java.util.List;
import questions.core.Question;
import questions.core.QuestionFactory;

public class MidtermExam implements Exam {
    private ExamConfiguration configuration;
    private List<QuestionFactory> questionFactories;
    private String sourcingStrategy;

    public MidtermExam(ExamConfiguration configuration, List<QuestionFactory> questionFactories, String sourcingStrategy) {
        this.configuration = configuration;
        this.questionFactories = questionFactories;
        this.sourcingStrategy = sourcingStrategy;
    }

    public String getType() {
        return "Midterm Exam";
    }

    public void displayInfo() {
        System.out.println("=========================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=========================================");
        System.out.println("Type:\n" + getType());
        System.out.println("Title:\n" + this.configuration.getTitle());
        System.out.println("Duration: " + this.configuration.getDuration() + " minutes");
        System.out.println("Passing Score: " + this.configuration.getPassingScore() + " Marks");
        System.out.println("Configuration Profiles:");

        if (this.configuration.hasNegativeMarking()) {
            System.out.println("✓ Negative Marking Enabled");
        } else {
            System.out.println("X Negative Marking Disabled");
        }

        if (this.configuration.hasQuestionShuffle()) {
            System.out.println("✓ Question Shuffle Activated");
        } else {
            System.out.println("X Question Shuffle Disabled");
        }

        if (this.configuration.isCalculatorAllowed()) {
            System.out.println("✓ Embedded Calculator Allowed");
        } else {
            System.out.println("X Embedded Calculator Allowed");
        }

        if (this.configuration.hasAutoSubmit()) {
            System.out.println("✓ Auto-Submit On Timeout");
        } else {
            System.out.println("X Auto-Submit Disabled");
        }

        System.out.println("Question Sourcing Strategy: " + this.sourcingStrategy);
        System.out.println("Compiled Structural Components:");

        for (QuestionFactory factory : this.questionFactories) {
            Question question = factory.createQuestion();
            System.out.println("- [Type: " + question.getType() + "] Points: " + question.getPoints() + " Difficulty: " + question.getDifficulty());
        }

        System.out.println("=========================================");
    }
}