package test3;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "test3")
public class Annotation {

	@Bean
	public DataSource driverClassName() {
		DriverManagerDataSource dds = new DriverManagerDataSource("jdbc:oracle:thin:@localhost:1521:ORCL", "students",
				"1234");
		dds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return dds;
	}
}
