package com.smart.attr;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 注入参数详解
 */
public class BeanAttrDITest {

  private static String[] CONFIG_FILES = {"com/smart/attr/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeClass
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testBeanRetrieveCar() {
    Car car = factory.getBean("car", Car.class);
    assertNotNull(car);
    System.out.println("" + car);
  }

  @Test
  public void testBeanRetrieveBoss() {
    Boss boss1 = factory.getBean("boss1", Boss.class);
    Boss boss2 = factory.getBean("boss2", Boss.class);
    assertFalse(boss1.getCar() == boss2.getCar());
  }

  @Test
  public void testBeanRetrieveBoss3() {
    Boss boss3 = factory.getBean("boss3", Boss.class);
    assertNotNull(boss3.getCar().getBrand());
  }

  @Test
  public void testBeanRetrieveBoss1() {
    Boss boss1 = factory.getBean("boss1", Boss.class);
    assertNotNull(boss1);
    System.out.println("boss1:" + boss1);
  }

  @Test
  public void testBeanRetrieveChildBoss() {
    Boss childBoss = factory.getBean("childBoss", Boss.class);
    assertNotNull(childBoss);
    System.out.println("childBoss:" + childBoss);
  }

  @Test
  public void testCascadeAttr() {
    SportsCar sportsCar = factory.getBean("sportsCar", SportsCar.class);
    System.out.println(sportsCar.getBrand());
  }

  @Test
  public void getListBean() {
    List list = factory.getBean("myList", List.class);
    System.out.println(list);
  }

  @Test
  public void getSetBean() {
    Set set = factory.getBean("mySet", Set.class);
    System.out.println(set);
  }

  @Test
  public void getMapBean() {
    Map map = factory.getBean("myMap", Map.class);
    System.out.println(map);
  }

}
