import java.util.Scanner;

public class runner_U8_L1_Activity_Two{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int rows = scan.nextInt();
    System.out.println("Enter number of columns:");
    int cols = scan.nextInt();
    System.out.println();
    int[][] mat = U8_L1_Activity_Two.multTable(rows, cols);
    for(int[] r : mat){
      for(int n : r){
        System.out.print(n + "\t");
      }
      System.out.println();
    }
  }
}
