package com.sist;

/*
 * 논리 연산자
 * 	논리곱 : &&(and) - 주어진 조건이 모두 true일 때 true
 * 	논리합 : ||(or) - 주어진 조건중 하나라도 true이면 true
 * 	부   정 : !(not) - true -> false, false -> true
 * 
 *  우선적으로 관계 연산자를 실행 후에 그 결과값으로 논리 연산을 수행한다.
 */

public class Ex03 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 7;

		// 논리곱
		boolean res1 = (su1 >= 7) && (su2 >= 5);
		System.out.println("res1 ==> " + res1);

		boolean res2 = (su1 >= 7) && (su2 < 5);
		System.out.println("res2 ==> " + res2);

		boolean res3 = (su1 < 7) && (su2 > 5);
		System.out.println("res3 ==> " + res3);

		boolean res4 = (su1 < 7) && (su2 < 5);
		System.out.println("res4 ==> " + res4);

		// 논리합
		boolean res5 = (su1 > 7) || (su2 > 5);
		System.out.println("res5 ==> " + res5);

		boolean res6 = (su1 > 7) || (su2 < 5);
		System.out.println("res6 ==> " + res6);

		boolean res7 = (su1 < 7) || (su2 > 5);
		System.out.println("res7 ==> " + res7);

		boolean res8 = (su1 < 7) || (su2 < 5);
		System.out.println("res8 ==> " + res8);

	}

}
