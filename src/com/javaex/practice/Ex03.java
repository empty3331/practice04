package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
		/*
		 intB는 intA의 주솟값을 복사한 상태므로 
		 배열값을 수정하면 intA도 같이 수정된다.
		 따라서 출력값은
		 20
		 6
		 10
		 이 된다.
		 */
		

	}

}
