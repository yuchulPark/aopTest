package com.bit.exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	// 특정 JoinPoint에서 실행될 pro()메서드를 구현
	// 매개변수로 전달받은 ProceedingJoinPoint를 통해 AroundAdvice를 구현할 수 있음
	public Object pro(ProceedingJoinPoint joinPoint) { // Around Advice사용할 때 매개변수를 무조건 써줘야함
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString(); // 메소드 이름을 가져옴
		System.out.println(methodName + "시작");
		long start = System.currentTimeMillis(); // 현재 시간을 millis second으로 줌 
		try {			
			re = joinPoint.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println(methodName + "종료");
		long finish = System.currentTimeMillis(); 
		System.out.println("걸린시간 : " + (finish - start));
		return re;
	}
//	public void before() {
//		System.out.println("타깃이 되는 메소드 실행하기 전");
//	}
//	public void before(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toLongString();
//		System.out.println(methodName + "이 실행하기 전");
//	}
//	public void after(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "가 완료 후");
//	}
//	public void afterReturning(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "가 정상완료 후");
//	}
	public void afterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 비정상적으로 종료함");
	}
}
