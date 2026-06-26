package questions.truefalse;

import questions.core.Question;

public class TrueFalseQuestion implements Question {
    private String questionText;
    private int points;
    private String difficulty;

    public TrueFalseQuestion(String questionText, int points, String difficulty) {
        this.questionText = questionText;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType() {
        return "True/False";
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public int getPoints() {
        return this.points;
    }

    public String getDifficulty() {
        return this.difficulty;
    }
}