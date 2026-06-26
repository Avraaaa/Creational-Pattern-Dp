package config;

public class ExamConfiguration {
    private String title;
    private int duration;
    private int passingScore;
    private boolean negativeMarking;
    private boolean questionShuffle;
    private boolean autoSubmit;
    private boolean calculatorAllowed;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setPassingScore(int passingScore) {
        this.passingScore = passingScore;
    }

    public int getPassingScore() {
        return this.passingScore;
    }

    public void setNegativeMarking(boolean negativeMarking) {
        this.negativeMarking = negativeMarking;
    }

    public boolean hasNegativeMarking() {
        return this.negativeMarking;
    }

    public void setQuestionShuffle(boolean questionShuffle) {
        this.questionShuffle = questionShuffle;
    }

    public boolean hasQuestionShuffle() {
        return this.questionShuffle;
    }

    public void setAutoSubmit(boolean autoSubmit) {
        this.autoSubmit = autoSubmit;
    }

    public boolean hasAutoSubmit() {
        return this.autoSubmit;
    }

    public void setCalculatorAllowed(boolean calculatorAllowed) {
        this.calculatorAllowed = calculatorAllowed;
    }

    public boolean isCalculatorAllowed() {
        return this.calculatorAllowed;
    }
}