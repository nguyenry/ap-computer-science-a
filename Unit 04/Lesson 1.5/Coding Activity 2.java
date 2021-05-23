/* Lesson 1 1/2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_5_Activity_Two{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int prod = 1;
    while (num > 0) {
      prod = prod * num;
      num--;
    }
    System.out.println(prod);
  }
}
