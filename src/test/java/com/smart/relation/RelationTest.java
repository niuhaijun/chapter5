package com.smart.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author niuhaijun
 * @date 2018/7/30 9:28
 */
public class RelationTest {

  private static String[] CONFIG_FILES = {"com/smart/relation/beans.xml"};
  private ApplicationContext context;

  @BeforeMethod
  public void setUp() {
    context = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  /**
   * 测试测试<bean>之间的继承关系
   */
  @Test
  public void testExtendRelation() {
    Car car1 = context.getBean("car1", Car.class);
    System.out.println(car1);

    Car car2 = context.getBean("car2", Car.class);
    System.out.println(car2);
  }

}
