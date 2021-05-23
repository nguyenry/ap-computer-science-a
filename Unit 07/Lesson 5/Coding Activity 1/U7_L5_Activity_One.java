public class U7_L5_Activity_One
{

  //Write the sortAndPrint method described in the assignment
  public static void sortAndPrint(String[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int low = i;
      for(int j = i + 1; j < arr.length; j++) {
        if (arr[j].compareTo(arr[low]) < 0) {
          low = j;
        }
      }
      String temp = arr[i];
      arr[i] = arr[low];
      arr[low] = temp;
    }
    for (String str : arr) {
      System.out.print(str + " ");
    }
  }
}
