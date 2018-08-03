package com.smart.anno;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AnnoAutowireTest {

  private static String[] CONFIG_FILES = {"com/smart/anno/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeMethod
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testAutoByName() {
    Boss boss = (Boss) factory.getBean("boss");
    assertNotNull(boss);
//		System.out.println("boss.office:"+boss.getOffice());
//		System.out.println("boss.title:"+boss.getTitle());
//		System.out.println("boss.car:"+boss.getCar());
  }

}
