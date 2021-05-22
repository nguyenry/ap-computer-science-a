/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import edhesive.assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    Airplane x = new Airplane();
    
    //Input details for Airplane 2
    System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
    String callSign = scan.nextLine();
    String uCallSign = callSign.toUpperCase();
    double iDist = scan.nextDouble();
    int iDir = scan.nextInt();
    int iAlt = scan.nextInt();
    Airplane y = new Airplane (uCallSign,iDist,iDir,iAlt);
    
    //Print out initial details
    System.out.println("\nInitial Positions:");
    System.out.println("\"Airplane 1\": " + x);
    System.out.println("\"Airplane 2\": " + y);
    double btw = x.distTo(y);
    System.out.println("The distance between the planes is " + btw + " miles.");
    int iAlt1 = x.getAlt();
    int iAbsAlt = (int) Math.abs(iAlt1 - iAlt);
    System.out.println("The difference in height between the planes is " + iAbsAlt + " feet.");
    
    //Move the airplanes
    x.gainAlt();
    x.gainAlt();
    x.gainAlt();
    x.gainAlt();
    y.loseAlt();
    y.loseAlt();
    x.move(10.5,50);
    y.move(8.0,125);
    
    //Print out new course
    System.out.println("\nNew Positions:");
    System.out.println("\"Airplane 1\": " + x);
    System.out.println("\"Airplane 2\": " + y);
    double newBtw = x.distTo(y);
    System.out.println("The distance between the planes is " + newBtw + " miles.");
    int newAlt1 = x.getAlt();
    int newAlt2 = y.getAlt();
    int newAbsAlt = Math.abs(newAlt1 - newAlt2);
    System.out.println("The difference in height between the planes is " + newAbsAlt + " feet.");
  }
}
