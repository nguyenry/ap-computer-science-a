/* Lesson 5 Coding Activity Question 1 */
public class Post {
  private String name;
  private String text;
  private int fav;
  
  public Post(String user, String contents, int favorites) {
    name = user;
    text = contents;
    fav = favorites;
  }
   public String toString() {
    return name + "\n" + text + "\n\tFavorited by " + fav + " users";
  }
}
