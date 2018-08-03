package com.smart.attr;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * 注入参数详解
 */
public class ParentContainerBeanTest {

  /**
   * 通过ref parent引用父容器中的Bean
   */
  @Test
  public void parent() {
    ClassPathXmlApplicationContext pFactory = new ClassPathXmlApplicationContext(
        new String[]{"com/smart/attr/beans1.xml"});
    ApplicationContext factory = new ClassPathXmlApplicationContext(
        new String[]{"com/smart/attr/beans2.xml"}, pFactory);
    Boss boss = factory.getBean("boss", Boss.class);
    assertNotNull(boss);
    System.out.println(boss.getCar().toString());
  }
}
