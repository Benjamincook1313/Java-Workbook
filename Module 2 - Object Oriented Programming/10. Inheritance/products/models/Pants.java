package models;
import java.util.Objects;

public class Pants extends Product implements Discountable{
  private int waist;
  public Pants(int waist, double price, String color, String brand){
    super(price, color, brand);

    this.waist = waist;
  }

  public Pants(Pants src) {
    super(src);
    this.waist = src.waist;
  }

  public int getWaist() {
    return waist;
  }

  public void setWaist(int waist) {
    this.waist = waist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pants pants = (Pants) o;
    return this.waist == pants.waist
        && this.getPrice() == super.getPrice()
        && this.getColor().equals(super.getColor())
        && this.getBrand().equals(super.getBrand());
  }

  @Override
  public int hashCode() {
    return Objects.hash(waist, super.getPrice(), super.getColor(), super.getBrand());
  }

  @Override
  public String toString() {
    return "Pants" +
        "\t" + getWaist() +
        "\t" + super.getPrice() +
        "\t" + super.getColor() +
        "\t" + super.getBrand();
  }

  @Override
  public void fold() {
    System.out.println("\n***** Folding Shirt *****");
    System.out.println("Hold pants upright");
    System.out.println("Fold one leg over the other");
    System.out.println("Fold pant from the bottom in thirds");
  }

  @Override
  public void discount() {
    super.setPrice(super.getPrice() / 2);
  }

}
