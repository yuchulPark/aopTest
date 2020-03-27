package com.bit.exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	// Ư�� JoinPoint���� ����� pro()�޼��带 ����
	// �Ű������� ���޹��� ProceedingJoinPoint�� ���� AroundAdvice�� ������ �� ����
	public Object pro(ProceedingJoinPoint joinPoint) { // Around Advice����� �� �Ű������� ������ �������
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString(); // �޼ҵ� �̸��� ������
		System.out.println(methodName + "����");
		long start = System.currentTimeMillis(); // ���� �ð��� millis second���� �� 
		try {			
			re = joinPoint.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println(methodName + "����");
		long finish = System.currentTimeMillis(); 
		System.out.println("�ɸ��ð� : " + (finish - start));
		return re;
	}
//	public void before() {
//		System.out.println("Ÿ���� �Ǵ� �޼ҵ� �����ϱ� ��");
//	}
//	public void before(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toLongString();
//		System.out.println(methodName + "�� �����ϱ� ��");
//	}
//	public void after(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "�� �Ϸ� ��");
//	}
//	public void afterReturning(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "�� ����Ϸ� ��");
//	}
	public void afterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ������������ ������");
	}
}
