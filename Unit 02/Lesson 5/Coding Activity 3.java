/* Lesson 5 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Three{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int x;
    double y;
    
    System.out.println("Type the number of sides:");
    x = scan.nextInt();
    System.out.println("Type a side length:");
    y = scan.nextDouble();
    
    RegularPolygon rp = new RegularPolygon(x,y);
    System.out.println(rp);
  }
}
