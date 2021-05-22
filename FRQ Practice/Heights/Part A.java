public class HeightMap
{
  /** A two-dimensional array of height values, initialized in the constructor
    * Guaranteed not to be null
    */
  private double[][] heights;

  /** @param r a valid row index in heights
    * @param c a valid column index in heights
    * @return true if the height at row r, column c is not at the edge of the
    * two-dimensional array heights, and is greater in value than all 8 surrounding
    * values; false otherwise.
    */
/*
  Description: isPeak() checks if a certain height is the highest around its immediate surroundings aka the 8 elements enveloping it
  Input parameters:
    int r, int c
  Output:
    returns true if the height is greater than (not equal to) its surroundings but returns false if the height is less than or equal to it
*/
  public boolean isPeak(int r, int c)
  {
    /* Implement your answer to part (a) here */
    boolean status = false;
    double height = heights[r][c];
    
    if (r == 0 || r == heights.length - 1 || c == 0 || c == heights[0].length - 1) { //checks if the height is on the edge
      return false;
    } else { //will check the height of the peak and compare it to the surrounding areas
    
      //left of the peak
      if (height > heights[r][c - 1]) {
        status = true; //keep true if greater than
      } else {
        return false; //immediately return false if else since it fails the conditions of what we're looking for
      }
      
      //above  the peak
      if (height > heights[r - 1][c]) {
        status = true;
      } else {
        return false;
      }
      
      //right of the peak
      if (height > heights[r][c + 1]) {
        status = true;
      } else {
        return false;
      }
      
      //below the peak
      if (height > heights[r + 1][c]) {
        status = true;
      } else {
        return false;
      }
      
      //left top corner
      if (height > heights[r - 1][c - 1]) {
        status = true;
      } else {
        return false;
      }
      
      //left bottom corner
      if (height > heights[r + 1][c - 1]) {
        status = true;
      } else {
        return false;
      }
      
      //right top corner
      if (height > heights[r - 1][c + 1]) {
        status = true;
      } else {
        return false;
      }
      
      //right bottom corner
      if (height > heights[r + 1][c + 1]) {
        status = true;
      } else {
        return false;
      }
    }
    return status;
  }

  /* Methods for subsequent parts of this question are not shown */

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public HeightMap(double[][] h){
    heights = h;
  }

}
