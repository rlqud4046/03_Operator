package com.sist;

/*
 * 관계 연산자(비교 연산자)
 * 	수에 대해 >=, >, <=, <, ==, !=(같지 않다) 
 *  결과는 참 거짓으로 나온다. 즉 결과값이 boolean형으로 반환됨.
 * 	조건식에 많이 사용되는 연산자
 */

public class Ex02 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 5;
		boolean test = false;

		test = (su1 >= su2);

		System.out.println("su1 >= su2 결과 = " + test);

		test = (su1 > su2);

		System.out.println("su1 > su2 결과 = " + test);
		
		test = (su1 <= su2);

		System.out.println("su1 <= su2 결과 = " + test);

		test = (su1 < su2);

		System.out.println("su1 < su2 결과 = " + test);

		test = (su1 == su2);

		System.out.println("su1 == su2 결과 = " + test);

		test = (su1 != su2);

		System.out.println("su1 != su2 결과 = " + test);

	}

}
