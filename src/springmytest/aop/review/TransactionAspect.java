package springmytest.aop.review;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

	@Around("execution(public * springmytest.aop.review.*.*(..))")
	public Object timing(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(String.format("%s.%s开始事物", pjp.getTarget().getClass().getSimpleName(),
				pjp.getSignature().getName()));
		try {
			Object result = pjp.proceed();
			System.out.println("提交事物");
			return result;
		} catch (Exception e) {
			System.out.println("回滚事物");
			throw e;
		}
	}
}
