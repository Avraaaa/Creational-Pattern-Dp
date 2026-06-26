package questions.essay;

import questions.core.Question;
import questions.core.QuestionEvaluator;
import questions.core.QuestionFactory;
import questions.core.QuestionRenderer;
import source.QuestionSource;

public class EssayFactory implements QuestionFactory {
    private QuestionSource source;
    private int points;
    private String difficulty;

    public EssayFactory(QuestionSource source, int points, String difficulty) {
        this.source = source;
        this.points = points;
        this.difficulty = difficulty;
    }

    public Question createQuestion() {
        String data = this.source.getQuestionData();
        return new EssayQuestion(data, this.points, this.difficulty);
    }

    public QuestionRenderer createRenderer() {
        return new EssayRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new EssayEvaluator();
    }
}