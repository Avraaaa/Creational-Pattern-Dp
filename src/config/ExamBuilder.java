package config;

public class ExamBuilder {
    private ExamConfiguration config;

    public ExamBuilder() {
        this.config = new ExamConfiguration();
    }

    public ExamBuilder setTitle(String title) {
        this.config.setTitle(title);
        return this;
    }

    public ExamBuilder setDuration(int duration) {
        this.config.setDuration(duration);
        return this;
    }

    public ExamBuilder setPassingScore(int passingScore) {
        this.config.setPassingScore(passingScore);
        return this;
    }

    public ExamBuilder enableNegativeMarking() {
        this.config.setNegativeMarking(true);
        return this;
    }

    public ExamBuilder enableQuestionShuffle() {
        this.config.setQuestionShuffle(true);
        return this;
    }

    public ExamBuilder enableAutoSubmit() {
        this.config.setAutoSubmit(true);
        return this;
    }

    public ExamBuilder enableCalculator() {
        this.config.setCalculatorAllowed(true);
        return this;
    }

    public ExamConfiguration build() {
        return this.config;
    }
}