//Diego Giron-Garrido
// Project 1 CS 3560
// Prof Yu Sun
import java.util.List;

public abstract class Question {
    protected String question; // the question being asked
    protected List<String> qOption; // options for the answer
    protected List<String> qAnswer; // answer submitted by student

    public Question(String question, List<String> qOption, List<String> qAnswers) {
        this.question = question;
        this.qOption = qOption;
        this.qAnswer = qAnswer;
    }

    public String getQuestion() { // returns the question
        return this.question;
    }

    public List<String> getqAnswer() { //returns the answer
        return this.qAnswer;
    }

    public List<String> getqOption() { // returns the possible options
        return this.qOption;


    }
    public abstract String correctAns(List<String> qSubmitted);
}

