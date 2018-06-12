package test6;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@ComponentScan(basePackages = "test6")
@PropertySource("classpath:test6/jdbc.properties")
public class AppConfig {

	@Bean
	public DataSource dataSource(Environment env) {
		DriverManagerDataSource dds = new DriverManagerDataSource(env.getProperty("jdbc.url"),
				env.getProperty("jdbc.username"), env.getProperty("jdbc.password"));
		dds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		return dds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dds) {
		return new JdbcTemplate(dds);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
