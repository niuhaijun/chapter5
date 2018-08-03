package com.smart.ditype;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DiTypeTest {

  private static String[] CONFIG_FILES = {"com/smart/ditype/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeClass
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testCar() {
    Car car = (Car) factory.getBean("car");
    assertNotNull(car);
    System.out.println(car);
  }

  @Test
  public void testBoss() {
    Boss boss = factory.getBean("boss", Boss.class);
    assertNotNull(boss);
    System.out.println("boss:" + boss);
  }

  @Test
  public void testCar2() {
    Car car2 = (Car) factory.getBean("car2");
    assertNotNull(car2);
    System.out.println(car2);
  }

  @Test
  public void testCar3() {
    Car car3 = (Car) factory.getBean("car3");
    assertNotNull(car3);
    System.out.println("car3:" + car3);
  }

  @Test
  public void testCar4() {
    Car car4 = (Car) factory.getBean("car4");
    assertNotNull(car4);
    System.out.println("car4:" + car4);
  }

  @Test
  public void testCar5() {
    Car car5 = (Car) factory.getBean("car5");
    assertNotNull(car5);
    System.out.println("car5:" + car5);
  }

  @Test
  public void testBoss1() {
    Boss boos1 = (Boss) factory.getBean("boss1");
    assertNotNull(boos1);
    System.out.println("boos1:" + boos1);
  }

  @Test
  public void testCar6() {
    Car car6 = (Car) factory.getBean("car6");
    assertNotNull(car6);
    System.out.println("car6:" + car6);
  }


}
