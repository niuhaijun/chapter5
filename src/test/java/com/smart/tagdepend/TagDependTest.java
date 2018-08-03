package com.smart.tagdepend;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * bean之间的关系
 */
public class TagDependTest {

  private static String[] CONFIG_FILES = {"com/smart/tagdepend/beans.xml"};
  public ApplicationContext factory = null;

  @BeforeMethod
  public void setUp() throws Exception {
    factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  /**
   * 继承关系
   */
  @Test
  public void testInheritTag() {
    Car car3 = factory.getBean("car3", Car.class);
    Car car4 = factory.getBean("car4", Car.class);
    assertNotNull(car3);
    assertNotNull(car4);
  }

  /**
   * 引用关系
   */
  @Test
  public void testReferenceTag() {
    Boss boss = factory.getBean("boss", Boss.class);
    assertNotNull(boss);
    System.out.println(boss);
  }
}
