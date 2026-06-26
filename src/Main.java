import config.ExamBuilder;
import config.ExamConfiguration;
import exams.Exam;
import exams.ExamFactory;
import exams.MidtermExamFactory;
import java.util.ArrayList;
import java.util.List;
import questions.core.Question;
import questions.core.QuestionFactory;
import questions.essay.EssayFactory;
import questions.mcq.McqFactory;
import questions.programming.ProgrammingFactory;
import questions.truefalse.TrueFalseFactory;
import source.BankQuestionSource;
import source.QuestionSource;

public class Main {
    public static void main(String[] args) {

        ExamBuilder builder = new ExamBuilder();
        ExamConfiguration config = builder
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .enableNegativeMarking()
                .enableQuestionShuffle()
                .enableAutoSubmit()
                .build();

        QuestionSource bankSource = new BankQuestionSource();

        List<QuestionFactory> factories = new ArrayList<>();

        factories.add(new McqFactory(bankSource, 2, "Medium"));
        factories.add(new McqFactory(bankSource, 2, "Easy"));
        factories.add(new EssayFactory(bankSource, 10, "Hard"));
        factories.add(new ProgrammingFactory(bankSource, 20, "Hard"));
        factories.add(new TrueFalseFactory(bankSource, 1, "Easy"));

        ExamFactory midtermFactory = new MidtermExamFactory();
        Exam oopMidterm = midtermFactory.createExam(config, factories, "Question Bank Mode");

        oopMidterm.displayInfo();
    }
}