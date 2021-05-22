/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two {
    public static void main(String[] args) {
      
       /* Write your code here */
      Scanner scan = new Scanner(System.in);
      int x;
      
      System.out.println("Please enter a three digit number:");
      x = scan.nextInt();
      System.out.println("Here are the digits:");
      System.out.println(x % 10);
      System.out.println(x / 10 % 10);
      System.out.println(x / 100);
    }
}
