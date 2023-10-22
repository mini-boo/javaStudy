package common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArroundAspect {
	
	//@around 편리함, 그러나 해당 메소드(target)의 befor/after 구분 x
	//이를 해결하기 위해 나온 JoinPoint Interface
	
	@Around(value = "execution(* biz.Car.buy*(..))")
	public void aroundAsepect(JoinPoint joinPoint) {
//		System.out.println("자동차를 구매 예정인가요?");
		
		Signature signiture = joinPoint.getSignature();
//		System.out.println(signiture.toLongString());
		
		ProceedingJoinPoint proJoinPoint = (ProceedingJoinPoint) joinPoint;
		try {
			System.out.println("자동차를 구매 예정인가요?");
			Object returnValue = proJoinPoint.proceed();
			System.out.println("자동차 구매를 완료했습니다.");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("문제 발생 : " + e.getMessage());
		}
	}
}
