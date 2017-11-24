package ve.com.proitcsolution.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ve.com.proitcsolution.config.JavaConfig;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext contextJavaConfig = new AnnotationConfigApplicationContext(JavaConfig.class);
    ((ConfigurableApplicationContext) (contextJavaConfig)).close();
    ApplicationContext contextXmlConfig = new ClassPathXmlApplicationContext(
        "application-context.xml");
    ((ConfigurableApplicationContext) (contextXmlConfig)).close();
  }
}
