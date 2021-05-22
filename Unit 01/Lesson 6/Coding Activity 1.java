/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One {
  public static void main(String[] args) {
    
    /* Write your code here */
    
    Scanner scan = new Scanner(System.in);
    int x;
    int y;
    
    System.out.println("Please enter two integers:");
    x = scan.nextInt();
    y = scan.nextInt();
    System.out.print("The average is: ");
    double z = (double) (x + y) / 2;
    System.out.println(z);
  }
}
