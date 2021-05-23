public class RightTriangle {
  
  private double base;
  private double height;
  private double area;
  private double hypotenuse;
  private double perimeter;
  private String triangle = "";
  
  public RightTriangle() {
    base = 1.0;
    height = 1.0;
  }
  
  public RightTriangle(double bs, double ht) {
    if (bs > 0) {
      base = bs;
    } else {
      base = 1;
    }
    if (ht > 0) {
      height = ht;
    } else {
      height = 1;
    }
  }
  
  public void setBase​(double bs) {
    if (bs > 0) {
      base = bs;
    }
  }
  
  public void setHeight​(double ht) {
    if (ht > 0) {
      height = ht;
    }
  }
  
  public double getBase() {
    return base;
  }
  
  public double getHeight() {
    return height;
  }
  
  public double getHypotenuse() {
    hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    return hypotenuse;
  }
  
  public double getArea() {
    area = (base * height) / 2;
    return area;
  }
  
  public double getPerimeter() {
    perimeter = (Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2))) + base + height;
    return perimeter;
  }
  
  public boolean equals(RightTriangle other) {
    if (this.getBase() == other.getBase() && this.getHeight() == other.getHeight()) {
      return true;
    }
    return false;
  }
  
  public String toString() {
    return triangle + "right triangle with base " + this.getBase() + ", height " + this.getHeight() + ", hypotenuse " + this.getHypotenuse();
  }
}
