package test4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 创建容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		// 获取组件
		Server server = context.getBean(Server.class);
		// 运行方法
		server.start();
	}
}
