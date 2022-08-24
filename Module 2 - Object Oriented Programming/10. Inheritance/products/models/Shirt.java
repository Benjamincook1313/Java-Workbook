package models;
import java.util.Objects;

public class Shirt extends Product {

  public enum Size {
    SMALL, MEDIUM, LARGE
  }
  private Size size;
  public Shirt(Size size, double price, String color, String brand) {
    super(price, color, brand);

     this.size = size;
  }
  public Shirt(Shirt src) {
    super(src);
    this.size = src.size;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shirt shirt = (Shirt) o;
    return this.size.equals(shirt.size)
        && super.getPrice() == shirt.getPrice()
        && super.getColor().equals(shirt.getColor())
        && super.getBrand().equals(shirt.getBrand());
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
  }

  @Override
  public String toString() {
    return "Shirt" +
        "\t" + getSize() + '\'' +
        "\t" + super.getPrice() + "" +
        "\t" + super.getColor() + "" +
        "\t" + super.getBrand() + "";
  }

  @Override
  public void fold() {
    System.out.println("\n****** Folding Pants *****");
    System.out.println("Lay shirt on flat surface");
    System.out.println("Fold shirt sideways");
    System.out.println("Bring the sleeves in");
    System.out.println("Fold from the bottom up");
  }

}
