/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a word");
    String word = scan.nextLine();
    
    int index = 0;
    while (index < word.length())
    {
      if (word.indexOf(word) % 2 == 0);
      {
        System.out.print(word.substring(index, index +1));
        index += 2;
      }
    }
  }
}
