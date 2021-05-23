/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int x = 0;
    int y = 0;
    
    System.out.println("Enter positive numbers (-1 to stop)");
    while (x > -1)
    {
      x = scan.nextInt();
      y += x;
    }
    System.out.println("Sum is " + (y + 1));
  }
}
