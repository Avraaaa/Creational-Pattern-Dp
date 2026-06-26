package questions.essay;

import questions.core.Question;
import questions.core.QuestionRenderer;

public class EssayRenderer implements QuestionRenderer {
    public void render(Question question) {
        System.out.println("Rendering Essay Prompt: " + question.getQuestionText());
        System.out.println("[Please write your detailed answer below. Minimum 200 words.]");
    }
}