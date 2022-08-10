
public class Parameters {

  public static void main(String[] args) {
    double measure1 = measureRectangle(-1, 4.1, "area");
    double measure2 = measureRectangle(3.5, 1.2, "perimeter");

    stringPrinter(3.2, 4.1, measure1, "area");
    stringPrinter(3.5, 1.2, measure2, "perimeter");
  }

  public static double measureRectangle(double length, double width, String option){
    if(length < 0 || width < 0){
      System.out.println("length or width cannot be negative");
      System.exit(0);
    }

    switch (option){
      case "area": return length * width;
      case "perimeter": return 2*(length + width);
      default: return 404;
    }
  }

  public static void stringPrinter(double len, double wid, double area, String option){
    System.out.println("The " + option + " of a rectangle with length " + len + " and width " +
      wid + " is equal to " + area + "\n");
  }
}