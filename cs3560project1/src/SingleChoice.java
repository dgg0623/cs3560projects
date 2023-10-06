//Diego Giron-Garrido
// Project 1 CS 3560
// Prof Yu Sun
import java.util.List;

public class SingleChoice extends Question { // proper oop principles
    public SingleChoice(String question, List<String> qOption, List<String> qInput) {
        super(question, qOption, qInput);
    }


    public String correctAns(List<String> qSubmitted) { // will return based on student input
        String correctAnswer = qAnswer.get(0);
        String submittedAnswer = qSubmitted.get(0);

        if (submittedAnswer.equals(correctAnswer)) {
            return "Correct answer!!!";
        } else {
            return "Wrong answer!!";
        }
    }
}
