/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Input String:");
    String x = scan.nextLine();
    int count = 0;
    
    for (int i = 0; i < x.length() - 1; i++) {
      if (x.substring(i, i + 2).equals("sh") || x.substring(i, i + 2).equals("Sh") || x.substring(i, i + 2).equals("sH") || x.substring(i, i + 2).equals("SH")) {
        count++;
      }
    }
    System.out.println("Contains \"sh\" " + count + " times.");
  }
}
