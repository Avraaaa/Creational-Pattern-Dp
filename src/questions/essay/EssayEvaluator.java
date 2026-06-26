package questions.essay;

import questions.core.Question;
import questions.core.QuestionEvaluator;

public class EssayEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        System.out.println("Essay submitted for manual grading by instructor.");

        if (answer.length() > 50) {
            System.out.println("Length requirement met. Pending review.");
            return question.getPoints();
        } else {
            System.out.println("Answer too short.");
            return 0;
        }
    }
}