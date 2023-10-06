//Diego Giron-Garrido
// Project 1 CS 3560
// Prof Yu Sun
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingService {
    private Question currentQuestion;
    private Map<String, String> studentInputs;

    public VotingService() {
        studentInputs = new HashMap<>();
    }

    public void acceptSubmission(Student student, String answer) {  // if there is a current question, that question is printed out
        if (currentQuestion != null) {
            System.out.println("Question: " + currentQuestion.getQuestion());
            for (String option : currentQuestion.getqOption()) {
                int qAmount = qAmountResponses(option);
            }
        }
    }

    private int qAmountResponses(String option) {
        int count = 0;
        for (String response : studentInputs.values()) {
            if (response.equals(option)) {
                count++;
            }
        }  return count;

    }

}


