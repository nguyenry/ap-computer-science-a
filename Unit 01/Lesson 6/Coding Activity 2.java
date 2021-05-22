/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    double x;
    
    System.out.println("Please input a decimal number:");
    x = scan.nextDouble();
    int roundNum = (int) (x + 0.5);
    System.out.println(roundNum);
  }
}
