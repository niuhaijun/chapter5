package com.smart.relation;

/**
 * @author niuhaijun
 * @date 2018/7/30 9:21
 */
public class Car {

  private String brand;
  private String maxSpeed;

  public Car() {
  }

  public Car(String brand, String maxSpeed) {
    this.brand = brand;
    this.maxSpeed = maxSpeed;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", maxSpeed='" + maxSpeed + '\'' +
        '}';
  }
}
