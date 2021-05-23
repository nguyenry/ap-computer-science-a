/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter the first octet:");
    int first = scan.nextInt();
    System.out.println("Please enter the second octet:");
    int second = scan.nextInt();
    System.out.println("Please enter the third octet:");
    int third = scan.nextInt();
    System.out.println("Please enter the fourth octet:");
    int fourth = scan.nextInt();
    
    if (first < 0 || first > 255)
    {
      System.out.println("Octet 1 is incorrect");
    }
    if (second < 0 || second > 255)
    {
      System.out.println("Octet 2 is incorrect");
    }
    if (third < 0 || third > 255)
    {
      System.out.println("Octet 3 is incorrect");
    }
    if (fourth < 0 || fourth > 255)
    {
      System.out.println("Octet 4 is incorrect");
    }
    else if (first >= 0 && first <= 255 && second >= 0 && second <= 255 && third >= 0 && third <= 255 && fourth >= 0 && fourth <= 255)
    {
      System.out.println("IP Address: " + first + "." + second + "." + third + "." + fourth);
    }
  }
}
