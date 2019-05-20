package hillel.jee;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/application-context.xml");

    System.out.println(context.getBean("fooBean"));

    System.out.println("-----------------");
    System.out.println("[DEBUG] Registered beans:");
    Arrays.stream(context.getBeanDefinitionNames())
        .map(beanName -> "- " + beanName)
        .forEach(System.out::println);

    System.out.println("-----------------");
  }
}
