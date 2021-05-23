/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int num = scan.nextInt();
    
    while (num > 0)
    {
      int digit = num % 10;
      System.out.println(digit);
      num /= 10;
    }
  }
}
