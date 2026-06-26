package source;

import java.util.Random;

public class FakerQuestionSource implements QuestionSource {
    private String[] templates = {
            "Explain the core concept of ",
            "What is the primary function of ",
            "Describe a real-world use case for ",
            "How do you implement "
    };

    private String[] topics = {
            "Polymorphism",
            "Encapsulation",
            "Inheritance",
            "Abstract Classes",
            "the Builder Pattern"
    };

    public String getQuestionData() {
        Random random = new Random();

        int templateIndex = random.nextInt(this.templates.length);
        int topicIndex = random.nextInt(this.topics.length);

        String generatedText = this.templates[templateIndex] + this.topics[topicIndex] + "?";

        return "FakerData: " + generatedText;
    }
}