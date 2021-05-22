/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    final double pi = 3.14;
    int r;
    
    System.out.println("Enter a radius:");
    r = scan.nextInt();
    System.out.println("Circumference: " + 2 * pi * r);
    System.out.println("Area: " + pi * r * r);
    
  }
}
