package ve.com.proitcsolution.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = {"classpath:application-context.xml"})
public class DependencyInjectionXmlConfigTest implements ApplicationContextAware {

  DatabaseServiceWithoutAnnotations databaseService;
  DataSource dataSource;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    databaseService = applicationContext.getBean(DatabaseServiceWithoutAnnotations.class);
    dataSource = applicationContext.getBean(DataSource.class);
  }

  @Test
  public void shouldDatabaseServiceNotNull() {
    assertNotNull(databaseService);
  }

  @Test
  public void shouldDataSourceNotNull() {
    assertNotNull(dataSource);
  }

}
