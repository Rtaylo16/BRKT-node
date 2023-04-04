package connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   private final JdbcTemplate jdbcTemplate;

   @Autowired
   public UserController(DataSource dataSource) {
      this.jdbcTemplate = new JdbcTemplate(dataSource);
   }

   @GetMapping("/users")
   public List<User> getUsers() {
      return jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
   }
}
