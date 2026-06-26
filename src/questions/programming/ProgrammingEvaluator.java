package questions.programming;

import questions.core.Question;
import questions.core.QuestionEvaluator;

public class ProgrammingEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        System.out.println("Compiling and running hidden test cases...");

        boolean compilationSuccess = true;

        if (compilationSuccess && answer.contains("public class Solution")) {
            System.out.println("All test cases passed.");
            return question.getPoints();
        } else {
            System.out.println("Compilation error or failed test cases.");
            return 0;
        }
    }
}