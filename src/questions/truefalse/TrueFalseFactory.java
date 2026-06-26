package questions.truefalse;

import questions.core.Question;
import questions.core.QuestionEvaluator;
import questions.core.QuestionFactory;
import questions.core.QuestionRenderer;
import source.QuestionSource;

public class TrueFalseFactory implements QuestionFactory {
    private QuestionSource source;
    private int points;
    private String difficulty;

    public TrueFalseFactory(QuestionSource source, int points, String difficulty) {
        this.source = source;
        this.points = points;
        this.difficulty = difficulty;
    }

    public Question createQuestion() {
        String data = this.source.getQuestionData();
        return new TrueFalseQuestion(data, this.points, this.difficulty);
    }

    public QuestionRenderer createRenderer() {
        return new TrueFalseRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new TrueFalseEvaluator();
    }
}