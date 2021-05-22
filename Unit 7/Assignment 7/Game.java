/*
  Name: Ryan Nguyen
  Date: 2/26/21
  Description: simulates a game similar to the one seen on the show Wheel Of Fortune
*/
import java.util.ArrayList;

public class Game
{
  public static void play(GameWheel g)
  {
    // Implement the play method here
    String str = "";
    int sum = 0;
    boolean n = true;
    ArrayList<String> color = new ArrayList<String>();
    
    //groups slices in 3 and stores info
    for (int i = 0; i < 3; i++) {
      int x = (int)(Math.random() * 20);
      int amt = g.getSlice(x).getPrizeAmount();
      color.add(g.getSlice(x).getColor());
      str += "Spin " + (i + 1) + " - " + g.getSlice(x) + "\n";
      sum += amt;
    }
    
    //checks to see if all colors are the same
    for (int i = 0; i < color.size() - 1; i++) {
      if (color.get(i).equals(color.get(i + 1))) {
        n = true;
      } else {
        n = false;
      }
    }
    
    if (n) { //prints when the colors are the same
      sum *= 2;
      System.out.println("Total prize money: $" + sum + "\n");
      System.out.println(str);
      System.out.println("Three " + color.get(0) + "s = double your money!");
    } else { //prints when colors are different
      System.out.println("Total prize money: $" + sum + "\n");
      System.out.println(str);
    }
  }
}
