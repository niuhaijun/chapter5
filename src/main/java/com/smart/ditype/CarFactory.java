package com.smart.ditype;

/**
 * 工厂类
 */
public class CarFactory {

  /**
   * 静态方法
   */
  public static Car createCar() {
    Car car = new Car();
    return car;
  }

  /**
   * 实例方法
   */
  public Car createHongQiCar() {
    Car car = new Car();
    car.setBrand("红旗CA72");
    return car;
  }
}
