package questions.truefalse;

import questions.core.Question;
import questions.core.QuestionEvaluator;

public class TrueFalseEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        System.out.println("Evaluating True/False answer: " + answer);

        if (answer.equals("True")) {
            return 1;
        } else {
            return 0;
        }
    }
}