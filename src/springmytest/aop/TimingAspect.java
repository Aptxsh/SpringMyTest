package springmytest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimingAspect {

	@Around("execution(public * springmytest.aop.service.*.*(..))") // 选择感兴趣的方法
	public Object timing(ProceedingJoinPoint pjp) throws Throwable {// pjp表示当前被拦截的方法
		long startMs = System.currentTimeMillis();
		try {
			Object result = pjp.proceed(); // 让当前被拦截的方法继续
			return result;
		} finally {
			long endMs = System.currentTimeMillis();
			System.out.println(
					String.format("%s.%s运行时间：%s", pjp.getTarget().getClass().getSimpleName(), // 被拦截的方法的对象的类名
							pjp.getSignature().getName(), // 被拦截的方法的方法名
							endMs - startMs));
		}

	}
}
