public class U6_L3_Activity_Two{

  public static void reverse(String[] words)
  {
    //Implement code to print each string from words backwards on a new line
    for (int i = 0; i < words.length; i++) {
      for (int j = words[i].length(); j > 0; j--) {
        System.out.print(words[i].substring(j - 1, j));
      }
      System.out.println();
    }
  }
}
