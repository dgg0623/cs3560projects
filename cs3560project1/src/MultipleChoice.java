//Diego Giron-Garrido
// Project 1 CS 3560
// Prof Yu Sun
import java.util.List;


public class MultipleChoice extends Question { // proper oop principles i hope
    public MultipleChoice(String question, List<String> qOption, List<String> qInput) {
        super(question, qOption, qInput);
    }

    @Override
    public String correctAns(List<String> qSubmitted) {

        for (String submittedAnswer : qSubmitted) {         // responds based on student input
            if (!qAnswer.contains(submittedAnswer)) {
                return "Wrong answer!!";
            }
        }
        return "Correct answer!!";
    }


}
