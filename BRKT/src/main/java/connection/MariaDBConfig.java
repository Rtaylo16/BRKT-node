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
			    "jdbc:mariadb://localhost:8081/local",
			    "root", "999999999"
			);
	   connection.close();
	   
	   try (PreparedStatement statement = connection.prepareStatement("""
		        INSERT INTO table_name(column1, column2)
		        VALUES (?, ?)
		      """)) {
		    statement.setString(1, someString);
		    statement.setInt(2, someInteger);
		    int rowsInserted = statement.executeUpdate();
		}
	   try (PreparedStatement statement = connection.prepareStatement("""
	            SELECT column1, column2
	            FROM table_name
	        """)) {
	    ResultSet resultSet = statement.executeQuery();
	    while (resultSet.next()) {
	        String val1 = resultSet.getString(1); // by column index
	        int val2 = resultSet.getInt("column2"); // by column name
	        // ... use val1 and val2 ...
	    }
	}
   }
}
