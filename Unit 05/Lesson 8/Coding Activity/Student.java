/*Lesson 8 Coding Activity*/
public class Student {
  
  private String first = "";
  private String last = "";
  private int grade;
  private double GPA;
  private static int num = 0;
  private int studentID;
  
  public Student() {
    first = "None";
    last = "None";
    grade = 0;
    GPA = 0.0;
    num++;
    studentID = num;
  }
  
  public Student(String firstName, String lastName, int gradeLevel, double gpa) {
    first = firstName;
    last = lastName;
    if (gradeLevel >= 0 && gradeLevel <= 12) {
      grade = gradeLevel;
    } else {
      grade = 0;
    }
    if (gpa >= 0 && gpa <= 4.5) {
      GPA = gpa;
    } else {
      GPA = 0;
    }
    num++;
    studentID = num;
  }
  
  public String toString() {
    return last + ", " + first + "\nGPA: " + GPA + "\nGrade Level: " + grade + " id # " + studentID;
  }
}
