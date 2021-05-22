/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    double p;
    
    System.out.println("Enter a price:");
    p = scan.nextDouble();
    System.out.print("Change from $20: $");
    System.out.println(20 - p);
  }
}
