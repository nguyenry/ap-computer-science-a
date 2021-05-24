/*
  Name: Ryan Nguyen
  Date: 04/22/2021
  Description: includes the printSameEnd() method for Unit 10: Lesson 1 - Coding Activity
*/
public class U10_L1_Activity_One
{
  /*
    Description: printSameEnd() prints all the positive integers that end with the same digit as the positive parameter
    Input parameters:
      int n
    Output:
      a list of the integers that pass through
  */
  public static void printSameEnd(int n)
  {
    if (n > n % 10) //this will make it so that we don't pass anything that is lower than the last digit
    {
      printSameEnd(n - 10); //increment by 10 down from the parameter
    }
    if (n != 0) { //this makes sure that we don't print out a 0 when the last digit is a 0
      System.out.print(n + " ");
    }
  }

}
