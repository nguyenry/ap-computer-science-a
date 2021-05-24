public class SpecialityCoffee extends Coffee
{

  // Additional member variable
  private String flavor;

  public SpecialityCoffee()
  {
    // Calls super-constructor to create default coffee then sets flavor
    super();
    flavor = "vanilla";
  }

  public SpecialityCoffee(String size, String type, String flavor)
  {
    // Calls constructor below with a mix of parameters and default values
    this(size, false, 1, type, flavor);
  }

  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    // Calls super-constructor to set first 4 variables then sets flavor
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  public String toString()
  {
    // Calls Coffee toString and appends flavor to end
    return super.toString() + " with " + flavor;
  }

  /*
    Description: getPrice() overrides the getPrice() method in the Coffee method and returns the price given by the Coffee method, plus the flavored syrup's price
    Input parameters:
      none
    Output:
      returns the price including the flavored syrup depending on the size of the coffee
  */
  public int getPrice() {
    if (this.getSize().equals("large") || this.getSize().equals("extra large")) { //find if the size is large or extra large
      return super.getPrice() + 70; //add 70 cents if it is large/extra large
    } else { //if the size is otherwise
      return super.getPrice() + 50; //returns price + 50 cents
    }
    
  }
}
