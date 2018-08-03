package com.smart.tagdepend;

public class Boss {

  private Car carId;

  public Car getCarId() {
    return carId;
  }

  public void setCarId(Car carId) {
    this.carId = carId;
  }

  @Override
  public String toString() {
    return "carId:" + carId;
  }
}
