package com.smart.auto;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 自动装配
 *
 */
public class AutowireTest {

  private static String[] CONFIG_FILES = {"com/smart/auto/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeMethod
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testAutoByName() {
    Boss boss = factory.getBean("boss", Boss.class);
    Car car = factory.getBean("car", Car.class);
    Office office = factory.getBean("office", Office.class);
    Office office1 = factory.getBean("office1", Office.class);
    assertNotNull(boss);
    System.out.println("car:" + car);
    System.out.println("office:" + office);
    System.out.println("office1:" + office1);
    System.out.println("boss:" + boss);
  }

}
