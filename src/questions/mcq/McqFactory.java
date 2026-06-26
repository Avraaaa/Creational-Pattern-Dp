package questions.mcq;

import questions.core.Question;
import questions.core.QuestionEvaluator;
import questions.core.QuestionFactory;
import questions.core.QuestionRenderer;
import source.QuestionSource;

public class McqFactory implements QuestionFactory {
    private QuestionSource source;
    private int points;
    private String difficulty;

    public McqFactory(QuestionSource source, int points, String difficulty) {
        this.source = source;
        this.points = points;
        this.difficulty = difficulty;
    }

    public Question createQuestion() {
        String data = this.source.getQuestionData();
        return new McqQuestion(data, this.points, this.difficulty);
    }

    public QuestionRenderer createRenderer() {
        return new McqRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new McqEvaluator();
    }
}