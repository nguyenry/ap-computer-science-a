public class Cow extends Animal
{

/*
  Description: Cow() is a constructor of the Cow class that creates an Animal object representing a cow
  Input parameters:
    none
  Output:
    creates a Cow object
*/
  public Cow()
  {
    super("cow"); //calls the constructor Animal() to create a cow
  }

/*
  Description: speak() returns the moo sound of a cow by overriding the speak() method in the parent Animal class
  Input parameters:
    none
  Output:
    returns a String
*/
  public String speak()
  {
    return "moo";
  }

}
