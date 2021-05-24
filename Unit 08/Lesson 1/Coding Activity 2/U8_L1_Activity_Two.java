public class U8_L1_Activity_Two
{

  // Write your multTable method as described in the assignment
  public static int[][] multTable(int row, int column) {
    
    int[][] arr = new int[row][column];
    
    for (int r = 0; r < arr.length; r++) {
      for (int c = 0; c < arr[r].length; c++) {
        arr[r][c] = r * c;
      }
    }
    return arr;
  }
}
