package connection;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;

@Configuration
public class MariaDBConfig {
   @Bean
   public DataSource dataSource() {
	   Connection connection = DriverManager.getConnection(
			    "jdbc:mariadb://localhost:3306/database_name",
			    "user", "password"
			);
	   connection.close();
   }
}
