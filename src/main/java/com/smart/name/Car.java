package com.smart.name;

/**
 * @author niuhaijun
 * @date 2018/7/25 9:22
 */
public class Car {

  private String brand;
  private String color;
  private double maxSpeed;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", color='" + color + '\'' +
        ", maxSpeed=" + maxSpeed +
        '}';
  }

  public void introduce() {
    System.out.println(this);
  }
}
