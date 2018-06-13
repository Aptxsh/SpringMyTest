package springmytest.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "springmytest.aop")
@EnableAspectJAutoProxy
public class AppConfig {

}
