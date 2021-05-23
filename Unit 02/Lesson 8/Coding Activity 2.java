/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter distance east:");
    double a = scan.nextDouble();
    System.out.println("Enter distance north:");
    double b = scan.nextDouble();
    
    double x = Math.pow(a,2);
    double y = Math.pow(b,2);
    double z = x + y;
    double c = Math.sqrt(z);
    System.out.println("Distance between points: " + c);
  }
}
