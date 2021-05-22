import java.util.ArrayList;

public class HeightMap
{
  /** A two-dimensional array of height values, initialized in the constructor (not shown)
    * Guaranteed not to be null
    */
  private double[][] heights;

  /** @return an ArrayList of String objects which give information on each peak in
    * the two-dimensional array heights.
    * Each string is in the format "Peak at (r, c): Height h", where r and c
    * are the row and column index, and h is the height of the peak.
    */
/*
  Description: peakInfo() stores the information of a peak into an ArrayList
  Input paremeters:
    none
  Output:
    returns an ArrayList with Strings in the format "Peak at (r, c): Height h"
*/
  public ArrayList<String> peakInfo()
  {
    /* Implement your answer to part (b) here */
    ArrayList <String> peaks = new ArrayList <String>();
    
    for (int r = 0; r < heights.length; r++) {
      for (int c = 0; c < heights[r].length; c++) {
        if (isPeak(r, c)) { //if the element is a peak, we will store its info
          peaks.add("Peak at (" + r + ", " + c + "): Height " + heights[r][c]); //add the peak's information to the ArrayList
        }
      }
    }
    return peaks;
  }

  /** @param r a valid row index in heights
    * @param c a valid column index in heights
    * @return true if the height at row r, column c is not at the edge of the
    * two-dimensional array heights, and is greater in value than all 8 surrounding
    * values; false otherwise.
    */
  private boolean isPeak(int r, int c)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    if(r == 0 || r == heights.length - 1
          || c == 0 || c == heights[0].length - 1)
    {
      return false;
    }

    double h = heights[r][c];

    return (heights[r][c - 1] < h && heights[r][c + 1] < h
            && heights[r - 1][c] < h && heights[r + 1][c] < h
            && heights[r - 1][c - 1] < h && heights[r - 1][c + 1] < h
            && heights[r + 1][c - 1] < h  && heights[r + 1][c + 1] < h);
  }

  /* CLASS MEMBERS FOR TESTING */
  /* DO NOT MODIFY ANY OF THE CONSTRUCTORS OR METHODS BELOW*/

  public HeightMap(double[][] h){
    heights = h;
  }

}
