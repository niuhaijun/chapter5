package com.smart.dynamic;


import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomSchemaTest {

  private static String[] CONFIG_FILES = {"com/smart/dynamic/custom.xml"};
  public ApplicationContext applicationContext = null;

  @BeforeClass
  public void setUp() throws Exception {
    applicationContext = new ClassPathXmlApplicationContext(CONFIG_FILES);

  }

  @Test
  public void registerBean() {
    Object userService = applicationContext.getBean("userService");
    assertNotNull(userService);

  }

}
