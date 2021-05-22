import java.util.Scanner;

public class Assignment3 {

  public static void main (String args[]) {
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    //Ask name
    System.out.println("Welcome. What is your name?");
    String name = scan.nextLine();
    
    //Start game
    System.out.println("Hello " + name + ". Are you ready to crack the code?");
    String ready = scan.nextLine();
    ready = ready.toLowerCase();
    if (ready.equals("yes"))
    {
      //PHASE 1
      System.out.println("\nPHASE 1");
      System.out.println("Enter a number:");
      int numPhase1 = scan.nextInt();
      if (numPhase1 == 3)
      {
        System.out.println("Correct!");
        //PHASE 2
        System.out.println("\nPHASE 2");
        System.out.println("Enter a number:");
        int numPhase2 = scan.nextInt();
        if (numPhase2 == 1 || (numPhase2 >= 33 && numPhase2 <= 100))
        {
          System.out.println("Correct!");
          //PHASE 3
          System.out.println("\nPHASE 3");
          System.out.println("Enter a number:");
          int numPhase3 = scan.nextInt();
          if (numPhase3 > 0 && (numPhase3 % 3 == 0 || numPhase3 % 7 == 0))
          {
            System.out.println("Correct!");
            System.out.println("You have cracked the code!");
          }
          //Failed PHASE 3
          else
          {
            System.out.println("Sorry, that was incorrect!");
            System.out.println("Better luck next time!");
          }
        }
        //Failed PHASE 2
        else
        {
          System.out.println("Sorry, that was incorrect!");
          System.out.println("Better luck next time!");
        }
      }
      //Failed PHASE 1
      else
      {
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!");
      }
    }
    //Failed confirmation
    else
    {
      System.out.println("Bye bye...");
    }
  }
}
