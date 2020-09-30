package ve.com.proitcsolution.service;

import javax.inject.Inject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import ve.com.proitcsolution.config.JavaConfig;

import static org.assertj.core.api.Assertions.assertThat;

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
    assertThat(databaseService).isNotNull().hasNoNullFieldsOrProperties();
  }

  @Test
  public void shouldBeDataSourceNotNull() {
    assertThat(dataSource).isNotNull();
  }

  @Test
  public void shouldBeAuditServiceNotNull() {
    assertThat(auditService).isNotNull();
  }

}
