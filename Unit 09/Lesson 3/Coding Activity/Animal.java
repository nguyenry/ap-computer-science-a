public class Animal
{

  private String name;
  
/*
  Description: Animal() is a constructor of the Animal class that creates an object representing an animal with a name
  Input parameters:
    String f
  Output:
    creates an Animal object
*/
  public Animal(String n)
  {
    name = n;
  }

/*
  Description: getName() returns the name of the Animal object
  Input parameters:
    none
  Output:
    returns a String
*/
  public String getName()
  {
    return name;
  }

/*
  Description: speak() returns the sound that the animal makes
  Input parameters:
    none
  Output:
    returns a String
*/
  public String speak()
  {
    return "";
  }

/*
  Description: toString() creates a String representation of the Animal object
  Input parameters:
    none
  Output:
    returns a String
*/
  public String toString()
  {
    return getName() + " (" + speak() + " " + speak() + ").";
  }

}
