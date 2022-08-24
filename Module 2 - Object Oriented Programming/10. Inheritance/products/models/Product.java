package models;

public abstract class Product implements Comparable<Product>{
  private double price;
  private String color;
  private String brand;

//  abstract classes cannot be called
//  make a class abstract if its only purpose is inheritance
  public Product(double price, String color, String brand){
    this.price = price;
    this.color = color;
    this.brand = brand;
  }

  public Product(Product src) {
    this.price = src.price;
    this.color = src.color;
    this.brand = src.brand;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public abstract void fold();

  @Override
  public int compareTo(Product specifiedObject) {
    String className = this.getClass().getSimpleName();
    String sClassName = specifiedObject.getClass().getSimpleName();
    if(!(className.equals(sClassName))){
      return className.compareTo(sClassName);
    }
    return (int) Math.round(this.getPrice() - specifiedObject.getPrice());
  }
}
