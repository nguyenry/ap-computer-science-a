/*
  Name: Ryan Nguyen
  Date: 03/11/21
  Description: Sequence Properties
    checks if a sequence is linear or quadratic
    includes Part A getDiffs() method
*/
public class SequenceProperties
{
  /** @param seq an array of integer values
    *     Precondition: seq.length > 1
    * @return an array of int values, where the element at index k is equal to the
    * difference between the elements at indices k + 1 and k of seq.
    */
  /*
    Description:
      getDiffs() takes an array and returns the difference between elements next to each other
    Input Parameters:
      int[] seq
    Output:
      an array that displays the differences (int-value) between every element
  */
  public static int[] getDiffs(int[] seq)
  {
    //create an array with a length that is equal to the number of spaces between each element aka (seq.length - 1)
    int[] diff = new int[seq.length - 1];
    
    for (int i = 0; i < seq.length - 1; i++) {
      diff[i] = seq[i + 1] - seq[i]; //assign the element at index i to be equal to the difference between the elements at i and i + 1
    }
    
    return diff; //return the array that we built in the for loop
  }

  /* Methods for subsequent parts of this question are not shown */

}
