package questions.mcq;

import questions.core.Question;
import questions.core.QuestionRenderer;

public class McqRenderer implements QuestionRenderer {
    public void render(Question question) {
        System.out.println("Rendering MCQ: " + question.getQuestionText());
        System.out.println(" A) ...");
        System.out.println(" B) ...");
    }
}