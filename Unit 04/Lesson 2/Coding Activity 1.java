/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L2_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    
    while (num1 <= num2) {
      if (num1 % 2 == 0) {
        System.out.print(num1 + " ");
      }
      num1++;
    }
  }
}
