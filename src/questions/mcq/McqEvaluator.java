package questions.mcq;

import questions.core.Question;
import questions.core.QuestionEvaluator;

public class McqEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        System.out.println("Evaluating MCQ answer: " + answer);

        return 0;
    }
}