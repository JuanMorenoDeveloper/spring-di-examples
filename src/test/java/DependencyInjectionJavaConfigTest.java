import javax.inject.Inject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ve.com.proitcsolution.config.JavaConfig;
import ve.com.proitcsolution.service.AuditService;
import ve.com.proitcsolution.service.DataSource;
import ve.com.proitcsolution.service.DatabaseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class DependencyInjectionJavaConfigTest {

  @Inject
  DatabaseService databaseService;
  @Inject
  DataSource dataSource;
  @Inject
  AuditService auditService;

  @Test
  public void shouldBeDatabaseServiceNotNull() {
    Assert.assertNotNull(databaseService);
  }

  @Test
  public void shouldBeDataSourceNotNull() {
    Assert.assertNotNull(dataSource);
  }

  @Test
  public void shouldBeAuditServiceNotNull() {
    Assert.assertNotNull(auditService);
  }

}
