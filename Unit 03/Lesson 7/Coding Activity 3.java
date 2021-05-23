/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U3_L7_Activity_Three{
  public static void main(String[] args){

    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    //First Rectangle
    System.out.println("Enter length:");
    double length1 = scan.nextDouble();
    Rectangle r1 = new Rectangle(length1);
    
    //Second Rectangle
    System.out.println("Enter 2 lengths:");
    double length2 = scan.nextDouble();
    double length3 = scan.nextDouble();
    Rectangle r2 = new Rectangle(length2, length3);
    
    if (r1.equals(r2))
    {
      System.out.println("Congruent Rectangles");
    }
    else
    {
      System.out.println("Different Rectangles");
    }
  }
}
