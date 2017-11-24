package ve.com.proitcsolution.service;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import ve.com.proitcsolution.config.JavaConfig;
import ve.com.proitcsolution.service.AuditService;
import ve.com.proitcsolution.service.DataSource;
import ve.com.proitcsolution.service.DatabaseService;

@SpringJUnitConfig(JavaConfig.class)
public class DependencyInjectionJavaConfigTest {

  @Inject
  DatabaseService databaseService;
  @Inject
  DataSource dataSource;
  @Inject
  AuditService auditService;

  @Test
  public void shouldBeDatabaseServiceNotNull() {
    assertNotNull(databaseService);
  }

  @Test
  public void shouldBeDataSourceNotNull() {
    assertNotNull(dataSource);
  }

  @Test
  public void shouldBeAuditServiceNotNull() {
    assertNotNull(auditService);
  }

}
