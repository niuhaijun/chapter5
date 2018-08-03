package com.smart.injectfun;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 方法注入
 */
public class InjectFunTest {

  private static String[] CONFIG_FILES = {"com/smart/injectfun/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeMethod
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testLookup() {
    MagicBoss mboss = factory.getBean("magicBoss", MagicBoss.class);
    assertNotSame(mboss.getCar(), mboss.getCar());
  }

  @Test
  public void testReplace() {
    MagicBoss mboss = factory.getBean("boss1", MagicBoss.class);
    assertEquals(mboss.getCar().getBrand(), "美人豹");
  }

}
