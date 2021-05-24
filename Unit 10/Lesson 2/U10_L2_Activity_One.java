/*
  Name: Ryan Nguyen
  Date: 04/27/21
  Description: includes code for Unit 10: Lesson 2 - Coding Activity
*/
public class U10_L2_Activity_One
{
  /*
    Description: reverseString() takes a String and reverts the characters so that the String now reads backwards
    Input parameters:
      String str
    Output:
      returns a reversed String
  */
  public static String reverseString(String str)
  {
    if (str.length() > 0)
    {
      String next = str.substring(0, str.length() - 1); //chops off the last letter of the word and stores the resulting String
      return str.substring(str.length() - 1) + reverseString(next); //prints out the last letter and calls the method again for the rest of the String, eventually returning a String that is reversed
    }
    else
    {
      return str; //a String of size 0 is already reversed, and anything less is empty, so just return the original input
    }
  }
}
