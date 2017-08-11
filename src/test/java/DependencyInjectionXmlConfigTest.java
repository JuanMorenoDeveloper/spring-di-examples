import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ve.com.proitcsolution.service.DataSource;
import ve.com.proitcsolution.service.DatabaseServiceWithoutAnnotations;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
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
    Assert.assertNotNull(databaseService);
  }

  @Test
  public void shouldDataSourceNotNull() {
    Assert.assertNotNull(dataSource);
  }

}
