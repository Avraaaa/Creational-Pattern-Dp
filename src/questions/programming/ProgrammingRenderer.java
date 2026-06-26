package questions.programming;

import questions.core.Question;
import questions.core.QuestionRenderer;

public class ProgrammingRenderer implements QuestionRenderer {
    public void render(Question question) {
        System.out.println("Rendering Coding Challenge: " + question.getQuestionText());
        System.out.println("Write your Java code below. Ensure your class is named Solution.");
    }
}