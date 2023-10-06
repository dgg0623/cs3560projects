//Diego Giron-Garrido
// Project 1 CS 3560
// Prof Yu Sun
public class Student {
    private static int IDincrease = 0; // my ID # is unique because it increases +1 per each student who submits

    private  String studID;

    public Student() {
        IDincrease = IDincrease + 1;
        this.studID = " " + IDincrease;


    }
        public String getstudID() { // to return the studentsID
            return studID;
        }

}
