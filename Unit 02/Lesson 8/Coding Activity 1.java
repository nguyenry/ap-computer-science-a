/* Lesson 8 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.testing.Math;

public class U2_L8_Activity_One{
  public static void main(String[] args){

    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a positive integer:");
    int x = scan.nextInt();
    double ran1 = Math.random();
    double ran2 = Math.random();
    double ran3 = Math.random();
    double ran4 = Math.random();
    double ran5 = Math.random();
    double ran6 = Math.random();
    double ran7 = Math.random();
    double ran8 = Math.random();
    double ran9 = Math.random();
    double ran10 = Math.random();
    int range = x;
    int min = 1;
    double ans1 = (int) (ran1 * range) + min;
    double ans2 = (int) (ran2 * range) + min;
    double ans3 = (int) (ran3 * range) + min;
    double ans4 = (int) (ran4 * range) + min;
    double ans5 = (int) (ran5 * range) + min;
    double ans6 = (int) (ran6 * range) + min;
    double ans7 = (int) (ran7 * range) + min;
    double ans8 = (int) (ran8 * range) + min;
    double ans9 = (int) (ran9 * range) + min;
    double ans10 = (int) (ran10 * range) + min;
    System.out.println(ans1 + "\n" + ans2 + "\n" + ans3 + "\n" + ans4 + "\n" + ans5 + "\n" + ans6 + "\n" + ans7 + "\n" + ans8 + "\n" + ans9 + "\n" + ans10);
  }
}
