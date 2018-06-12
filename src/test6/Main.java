package test6;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		OperatorDao operatorDaoImpl = context.getBean(OperatorDaoImpl.class);

		// Operator operator = operatorDaoImpl.findOne(1002);
		// if (operator != null) {
		// System.out.println(
		// String.format("%s %s %s %s %s", operator.getId(),
		// operator.getUsername(),
		// operator.getPassword(), operator.getRole(), operator.getDisabled()));
		// }else {
		// System.out.println("没有搜索结果");
		// }

		// List<Operator> list = operatorDaoImpl.findAll();
		// if (list != null) {
		// for (Operator operator : list) {
		// System.out.println(String.format("%s %s %s %s %s", operator.getId(),
		// operator.getUsername(), operator.getPassword(), operator.getRole(),
		// operator.getDisabled()));
		// }
		// } else {
		// System.out.println("没有搜索结果");
		// }

		// operatorDaoImpl.create("root", "root", "HR");

		// operatorDaoImpl.updatePassword(1003, "123");

		// operatorDaoImpl.delete(1003);

		// operatorDaoImpl.disable(1002);

		// operatorDaoImpl.enable(1002);
	}
}
