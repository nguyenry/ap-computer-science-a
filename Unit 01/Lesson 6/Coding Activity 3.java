/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    double x;
    
    System.out.println("Please input a decimal number:");
    x = scan.nextDouble();
    x *= 100;
    int y = (int) x;
    System.out.print(y / 10 % 10 + " ");
    System.out.println(y % 10);
  }
}
