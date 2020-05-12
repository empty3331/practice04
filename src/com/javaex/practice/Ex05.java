package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		//5개 수의 평균값 구하기
		
		Scanner sc = new Scanner(System.in);
		double[] average = new double[5];
		double sum = 0;

		
		for(int i =0; i<average.length; i++) {
			average[i] = sc.nextInt();
		}
		
		
		for(int i =0; i<average.length; i++) {
			sum = sum + average[i];
			
		}
		
		System.out.println("평균은 "+sum/average.length+" 입니다."); 
		
		sc.close();

	}

}
