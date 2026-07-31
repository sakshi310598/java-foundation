package Encapsulation;

public class Students {

     private String studentName;
     private int rollNumber;
     private String collegeName;

    //Non-parametrized constructor
    public Students() {
    }

    //Parametrized constructor
    public Students(String studentName, int rollNumber, String collegeName) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.collegeName = collegeName;
    }

    // Getter & Setter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
