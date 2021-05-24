public class Farm
{

  private Farmer theFarmer; //change Animal to Farmer since theFarmer is not considered as an Animal
  private Animal firstAnimal;
  private Animal secondAnimal;
  private Animal thirdAnimal;

/*
  Description: Farm() is a constructor of the Farm class that creates an object representing a farm with 4 attributes: a Farmer and 3 Animals
  Input parameters:
    Farmer f, Animal a1, Animal a2, Animal a3
  Output:
    creates a Farm object
*/
  public Farm(Farmer f, Animal a1, Animal a2, Animal a3)
  {
    theFarmer = f;
    firstAnimal = a1;
    secondAnimal = a2;
    thirdAnimal = a3;
  }

/*
  Description: toString() creates a String representation of the Farm object
  Input parameters:
    none
  Output:
    returns a String
*/
  public String toString()
  {
    String s = theFarmer + " had a farm.";
    s += "\nAnd on that farm he had a " + firstAnimal;
    s += "\nAnd on that farm he had a " + secondAnimal;
    s += "\nAnd on that farm he had a " + thirdAnimal;
    return s;
  }

}
