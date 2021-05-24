public class Pig extends Animal
{

/*
  Description: Pig() is a constructor of the Pig class that creates an Animal object representing a pig
  Input parameters:
    none
  Output:
    creates a Pig object
*/
  public Pig()
  {
    super("pig"); //calls the constructor Animal() to create a pig
  }

/*
  Description: speak() returns the oink sound of a pig by overriding the speak() method in the parent Animal class
  Input parameters:
    none
  Output:
    returns a String
*/
  public String speak()
  {
    return "oink";
  }

}
