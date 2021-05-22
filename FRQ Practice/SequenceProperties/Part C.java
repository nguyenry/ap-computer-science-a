/*
  Name: Ryan Nguyen
  Date: 03/11/21
  Description: Sequence Properties
    checks if a sequence is linear or quadratic
    includes Part A getDiffs() method, Part B isLinear(), and Part C isQuadratic() method
*/
public class SequenceProperties
{

  /** @param seq an array of integer values
    *     Precondition: seq.length > 2
    * @return true if seq is quadratic: that is the sequence is not linear, and the
    * differences between all consecutive pairs of elements in seq form a linear
    * sequence; false otherwise.
    */

  /*
    Description:
      checks to see if an array is quadratic or if the difference between all consecutive pairs of elements are linear
    Input Parameters:
      int[] seq
    Output:
      returns true if the array is quadratic and returns false otherwise
  */
  public static boolean isQuadratic(int[] seq)
  {
    /* Implement your answer to part (c) here */
    int[] diff = getDiffs(seq); //create diff to check if linear
    
    if (isLinear(seq)) { //will return false when seq is linear
      return false;
    }
    if (isLinear(diff)) { //will return true when diffs of seq are linear
      return true;
    }
    return false;
  }

  /** @param seq an array of integer values
    *     Precondition: seq.length > 1
    * @return an array of int values, where the element at index k is equal to the
    * difference between the elements at indices k + 1 and k of seq.
    */
  public static int[] getDiffs(int[] seq)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    int[] diffs = new int[seq.length - 1];
    for(int k = 0; k < diffs.length; k++)
      diffs[k] = seq[k + 1] - seq[k];
    return diffs;
  }

  /** @param seq an array of integer values
    *     Precondition: seq.length > 1
    * @return true if seq is linear: that is the differences between all consecutive
    * pairs of elements in seq are identical; false otherwise.
    */
  public static boolean isLinear(int[] seq)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    int[] diffs = getDiffs(seq);
    for(int k = 1; k < diffs.length; k++)
      if(diffs[k] != diffs[0])
          return false;
    return true;
  }

}
