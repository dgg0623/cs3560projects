//Diego Giron-Garrido
// Project 1 CS 3560
// Prof Yu Sun

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SimulationDriver {
    public static void main(String [] args) {
        List<String> multiOptions = new ArrayList<String>(); // answer options for either type of Q
        List<String> singleOptions = new ArrayList<String>();

        singleOptions.add("True/T");
        singleOptions.add("False/F"); // single answers can be T or F


        multiOptions.add("A");
        multiOptions.add("B");
        multiOptions.add("C");  // answers for multi can be 1 or multiple
        multiOptions.add("D");


// question, answer is C
        Question multichoiceQ = new MultipleChoice("How are you doing today?", multiOptions, List.of("C"));

        //question, answer is False
        Question singlechoiceQ = new SingleChoice("Is the Earth flat?", singleOptions, List.of("False"));

        List<Student> students = new ArrayList<>(); // max class size based on our class size (according to class discord member number)
        int classSize = 83;

        for (int i = 0; i < classSize; i++){ // to create 83 students
            students.add(new Student());
        }

        for (Student student: students) {

            System.out.println ("Students' ID: " + student.getstudID());    // unfinished, did this to at least return something
            System.out.println("Student Submissions: " + List.of("C"));
            for (Question question : List.of(multichoiceQ, singlechoiceQ)) {




            }


        }





    }



}
    