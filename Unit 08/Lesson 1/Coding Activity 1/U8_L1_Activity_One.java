public class U8_L1_Activity_One
{

  // Write your diagSum method as described in the assignment
  public static int diagSum(int[][] arr) {
    
    int sum = arr[0][0];
    double row = 0;
    double column = 0;
    double check;
    
    for (int r = 0; r < arr.length; r++) {
      for (int c = 1; c < arr[r].length; c++) {
        row = r;
        column = c;
        check = row / column; // if not double, for row 3 & column 4, r/c = 0.75, which rounds up to 1, meaning we are not adding up the correct values
        
        if (check == 1) {
          sum += arr[r][c];
        }
        check = 0;
      }
    }
    return sum;
  }
}
