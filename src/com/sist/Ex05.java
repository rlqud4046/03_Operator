 package com.sist;

/*
 * 배정 연산자 / 단축 배정 연산자
 * 	배정 연산자 =
 * 		형식) 변수 = 변수 or 값 or 수식;
 * 		
 * 		좌변에 우변의 값을 배정
 * 		좌변에는 항상 변수가 와야 한다. 
 * 
 * 	단축 배정 연산자 += 
 * 		배정연산자를 간편하게 사용하는 연산자
 *  
 */

public class Ex05 {

	public static void main(String[] args) {

		int a = 10, b = 27, result = 0;

		a = b;
		System.out.println("a = " + a);

		a = b + 29;
		System.out.println("a = " + a);

		result = result + b; // 누적변수 라고도 부름. 자기 자신에 수식을 적용후 그게 자시 자신이 됨
		// result += b; 이렇게 줄일 수 있는데 이를 단축 배정 연산자 라고 함.

		System.out.println("result == > " + result);

		int su = 15;
		
		System.out.println("su ==> " + (su +=5));
		System.out.println("su ==> " + (su -=5));
		System.out.println("su ==> " + (su *=5));
		System.out.println("su ==> " + (su /=5));
		System.out.println("su ==> " + (su %=5));

	}

}
