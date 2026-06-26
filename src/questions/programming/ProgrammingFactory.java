package questions.programming;

import questions.core.Question;
import questions.core.QuestionEvaluator;
import questions.core.QuestionFactory;
import questions.core.QuestionRenderer;
import source.QuestionSource;

public class ProgrammingFactory implements QuestionFactory {
    private QuestionSource source;
    private int points;
    private String difficulty;

    public ProgrammingFactory(QuestionSource source, int points, String difficulty) {
        this.source = source;
        this.points = points;
        this.difficulty = difficulty;
    }

    public Question createQuestion() {
        String data = this.source.getQuestionData();
        return new ProgrammingQuestion(data, this.points, this.difficulty);
    }

    public QuestionRenderer createRenderer() {
        return new ProgrammingRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new ProgrammingEvaluator();
    }
}