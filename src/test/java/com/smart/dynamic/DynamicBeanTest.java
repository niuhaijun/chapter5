package com.smart.dynamic;

import static org.testng.Assert.assertNotNull;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DynamicBeanTest {

  private static String[] CONFIG_FILES = {"com/smart/dynamic/beans.xml"};
  public ApplicationContext applicationContext = null;

  @BeforeClass
  public void setUp() throws Exception {
    applicationContext = new ClassPathXmlApplicationContext(CONFIG_FILES);

  }

  @Test
  public void registerBean() {
    try {
      Object userService1 = applicationContext.getBean("userService1");
      Object userService2 = applicationContext.getBean("userService2");
      assertNotNull(userService1);
      assertNotNull(userService2);
    } catch (NoSuchBeanDefinitionException exception) {
      exception.printStackTrace();
    }

    //UserServiceFactoryBean.build(applicationContext);

    Object userService1 = applicationContext.getBean("userService1");
    Object userService2 = applicationContext.getBean("userService2");
    assertNotNull(userService1);
    assertNotNull(userService2);
  }

}
