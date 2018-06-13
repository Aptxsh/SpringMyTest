package springmytest.aop.review;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "springmytest.aop.review")
@EnableAspectJAutoProxy
public class AppConfig {

}
