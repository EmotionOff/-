package kr.co.acomp.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {
    //AspectJ ����Ʈ�� ǥ������ ����Ʈ �����ڸ� �̿��Ͽ� �ۼ���
	//execution:����Ʈ�� �������߿��� ���� ��ǥ������ ���
	@Before("execution(* kr.co.acomp.hello..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String targetMethodName=
				joinPoint.getSignature().getName();
		
		System.out.println(targetMethodName+" is inboked...");
	}
}
