package test4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // 组件扫描
@ComponentScan(basePackages = "test4") // 扫面路径
@PropertySource("classpath:test4/server.properties") // 配置文件的路径
public class AppConfig {

}
