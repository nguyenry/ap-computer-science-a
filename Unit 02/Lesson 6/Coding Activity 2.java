/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter radius:");
    double r = scan.nextDouble();
    
    Circle c = new Circle(r);
    double a = c.getArea();
    System.out.println("Area: " + a);
    System.out.println("Radius is being doubled...");
    double x = c.getRadius();
    c.setRadius(x * 2);
    double a2 = c.getArea();
    System.out.println("Area: " + a2);
  }
}
