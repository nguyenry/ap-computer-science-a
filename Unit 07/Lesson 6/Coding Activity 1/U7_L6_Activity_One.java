public class U7_L6_Activity_One
{

  //Write the sortAndPrint method described in the assignment
  public static void sortAndPrint(String[] arr) {
    for (int i = 1; i < arr.length; i++) {
      String toInsert = arr[i];
      int j;
      for (j = i - 1; j >= 0; j--) {
        if (arr[j].compareTo(toInsert) >= 0) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }
      arr[j + 1] = toInsert;
      
      for (String str : arr) {
        System.out.print(str + " ");
      }
      System.out.println();
    }
  }
}
