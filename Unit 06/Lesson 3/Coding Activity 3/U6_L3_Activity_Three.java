public class U6_L3_Activity_Three{

  // Write your printIngs method here
  public static void printIngs(String[] list) {
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].length() > 3)
      {
        if (list[i].substring(list[i].length() - 3, list[i].length() ).equals("ing"))
        {
          System.out.println(list[i]);
        }
      }
    }
  }
}
