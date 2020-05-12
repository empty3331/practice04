package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i =0; i < intArray.length; i++) {
			/*i<= intArray.length 로 적으면 
			 6번째 intArray[]가 없으므로 오류가 나게 된다.
			 부호 < --> <= 로 수정
			*/
			result = result + intArray[i];
		}
		
		System.out.println(result);
		

	}

}
