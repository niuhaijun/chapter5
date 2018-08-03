package com.smart.simple;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeanRetrieveTest {

  private static String[] CONFIG_FILES = {"com/smart/simple/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeClass
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testBeanRetrieve() {
    Car car = factory.getBean("#car1", Car.class);
    assertNotNull(car);
  }
}
