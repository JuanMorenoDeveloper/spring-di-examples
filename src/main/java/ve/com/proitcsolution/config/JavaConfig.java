package ve.com.proitcsolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ve.com.proitcsolution.service.AuditService;
import ve.com.proitcsolution.service.DataSource;

@Configuration
@ComponentScan(basePackages = {"ve.com.proitcsolution.service"})
public class JavaConfig {

  @Bean
  public DataSource dataSource() {
    DataSource dataSource = new DataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://127.0.0.1/");
    dataSource.setUsername("production username");
    dataSource.setPassword("production password");
    return dataSource;
  }

  @Bean
  public AuditService auditService() {
    AuditService auditService = new AuditService("INFO");
    return auditService;
  }
}
