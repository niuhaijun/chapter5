package com.smart.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author niuhaijun
 * @date 2018/7/25 9:26
 */
public class BeanNameTest {

  /**
   * Bean的命名 可以通过<bean/>的name属性和id属性设置
   */
  @Test
  public void testConfigBeanName() {
    String location = "classpath:com/smart/name/beans.xml";
    ApplicationContext context = new ClassPathXmlApplicationContext(location);

    Car car1 = context.getBean("car1", Car.class);
    car1.introduce();
    Car car2 = context.getBean("car2", Car.class);
    car2.introduce();

    Car car3 = context.getBean("car3", Car.class);
    car3.introduce();
    Car car4 = context.getBean("car4", Car.class);
    car4.introduce();

    Car car = context.getBean("com.smart.name.Car", Car.class);
    car.introduce();

  }
}
