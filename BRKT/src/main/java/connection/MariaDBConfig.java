package connection;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;

@Configuration
public class MariaDBConfig {
   @Bean
   public DataSource dataSource() {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
      dataSource.setUrl("jdbc:mariadb://localhost:3306/mydatabase");
      dataSource.setUsername("myusername");
      dataSource.setPassword("mypassword");
      return dataSource;
   }
}
