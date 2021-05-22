public class Position {
  
  private double xPos;
  private double yPos;
  private double dist;
  
  /* will set Position to a certain value on the 2d grid*/
  public Position(double x, double y) {
    xPos = x;
    yPos = y;
  }
  
  /* will change values of xPos & yPos to move Position.*/
  public void move(double pos, String dir) {
    if (dir.equals("N")) {
      /* if North, will add to y-value */
      yPos += pos;
      dist += pos;
    } else if (dir.equals("S")) {
      /* if South, will subtract from y-value */
      yPos -= pos;
      dist += pos;
    } else if (dir.equals("E")) {
      /* if East, will add to x-value */
      xPos += pos;
      dist += pos;
    } else if (dir.equals("W")) {
      /* if West, will subtract from x-value */
      xPos -= pos;
      /* will add up the accumulated distances*/
      dist += pos;
    }
  }
  
  public String toString() {
    return "(" + xPos + ", " + yPos + ")";
  }
  
  public double totalDistance() {
    /* because distances have been kept track of, all we have to do is return the end value */
    return dist;
  }
}
