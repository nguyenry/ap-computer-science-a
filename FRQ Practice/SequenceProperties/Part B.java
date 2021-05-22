/*
  Name: Ryan Nguyen
  Date: 03/11/21
  Description: Sequence Properties
    checks if a sequence is linear or quadratic
    includes Part A getDiffs() method and Part B isLinear() method
*/
public class SequenceProperties
{

  /** @param seq an array of integer values
    *     Precondition: seq.length > 1
    * @return true if seq is linear: that is the differences between all consecutive
    * pairs of elements in seq are identical; false otherwise.
    */
  
  /*
    Description:
      checks to see if an array is linear or if all consecutive pairs of elements are identical
    Input Parameters:
      int[] seq
    Output:
      returns true if the array is linear and returns false otherwise
  */
  public static boolean isLinear(int[] seq)
  {
    /* Implement your answer to part (b) here */
    int[] diff = getDiffs(seq);
    boolean isLin = true; //will remain true if passes through for loop and is linear
    
    for (int i = 1; i < diff.length; i++) {
      if (diff[i] != diff[0]) { //when element is not equal to the first, we return false
        isLin = false;
        break;
      }
    }
    
    return isLin; //will return if sequence is linear
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

  /* Methods for subsequent parts of this question are not shown */

}
