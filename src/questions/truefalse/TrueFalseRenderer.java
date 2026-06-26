package questions.truefalse;

import questions.core.Question;
import questions.core.QuestionRenderer;

public class TrueFalseRenderer implements QuestionRenderer {
    public void render(Question question) {
        System.out.println("Rendering True/False: " + question.getQuestionText());
        System.out.println(" 1) True");
        System.out.println(" 2) False");
    }
}