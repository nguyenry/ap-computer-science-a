public class Sheep extends Animal
{

/*
  Description: Sheep() is a constructor of the Sheep class that creates an Animal object representing a sheep
  Input parameters:
    none
  Output:
    creates a Sheep object
*/
  public Sheep()
  {
    super("sheep"); //calls the constructor Animal() to create a sheep
  }

/*
  Description: speak() returns the baa sound of a sheep by overriding the speak() method in the parent Animal class
  Input parameters:
    none
  Output:
    returns a String
*/
  public String speak()
  {
    return "baa";
  }

}
