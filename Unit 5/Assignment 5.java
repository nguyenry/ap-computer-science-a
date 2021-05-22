public class Fraction
{
  //Variables
  private int numerator;
  private int denominator;
  private static int num = 0;
  private int numOfFrac;
  private int mixed;
  private String mixxy;
  
  //Constructors
  public Fraction() {
    numerator = 1;
    denominator = 1;
    num++;
    numOfFrac = num;
  }
  
  public Fraction(int n, int d) {
    if (n > 0) {
      numerator = n;
    } else {
      numerator = 1;
    }
    if (d > 0) {
      denominator = d;
    } else {
      denominator = 1;
    }
    num++;
    numOfFrac = num;
  }
  
  //Accessors
  public int getNumerator() {
    return numerator;
  }
  
  public int getDenominator() {
    return denominator;
  }
  
  public static int getNumFractions() {
    return num;
  }
  
  public String toString() {
    return numerator + "/" + denominator;
  }
  
  public String mixedNumber() {
    if (numerator > denominator) {
      mixed = numerator / denominator;
      numerator = numerator % denominator;
    }
    if (numerator > 0) {
      return mixed + " " + numerator + "/" + denominator;
    }
    return mixed + "";
  }
  
  public void setNumerator(int n) {
    if (n > 0) {
      numerator = n;
    }
  }
  
  public void setDenominator(int d) {
    if (d > 0) {
      denominator = d;
    }
  }
  
  public void add(int n, int d) {
    if (n > 0 && d > 0) {
      numerator = numerator * d + n * denominator;
      denominator = denominator * d;
    }
  }
  
  public void add(Fraction other) {
    numerator = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
    denominator = this.getDenominator() * other.getDenominator();
  }
  
  public void multiply(int n, int d) {
    if (n > 0 && d > 0) {
      numerator = numerator * n;
      denominator = denominator * d;
    }
  }
  
  public void multiply(Fraction other) {
    numerator = this.getNumerator() * other.getNumerator();
    denominator = this.getDenominator() * other.getDenominator();
  }
}
