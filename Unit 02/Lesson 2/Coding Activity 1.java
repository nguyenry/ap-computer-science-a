/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String item;
    int qty;
    double cost;
    
    System.out.println("What type of item are you buying?");
    item = scan.nextLine();
    System.out.println("How many are you buying?");
    qty = scan.nextInt();
    System.out.println("How much does each one cost?");
    cost = scan.nextDouble();
    System.out.println(qty + " " + item + " at $" + cost + " each will cost you $" + (qty * cost));
  }
}
