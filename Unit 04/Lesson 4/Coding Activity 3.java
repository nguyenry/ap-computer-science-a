/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter Strings:");
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    
    if (str1.length() == (str2.length())) {
      for (int i = 0; i < str1.length(); i++) 
      {
        System.out.print(str1.substring(i, i+1));
        System.out.print(str2.substring(i, i+1));
      }
    } else {
     System.out.println("error"); 
    }
  }
}
