package questions.mcq;

import questions.core.Question;

public class McqQuestion implements Question {
    private String questionText;
    private int points;
    private String difficulty;

    public McqQuestion(String questionText, int points, String difficulty) {
        this.questionText = questionText;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType() {
        return "MCQ";
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