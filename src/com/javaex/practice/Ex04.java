package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//3의 배수 갯수와 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int sum = 0;
		int count = 0;
		
		//3의 배수의 갯수
		System.out.print("주어진 배열에서 3의 배수의 개수=>");
		for(int i =1; i<data.length; i++) {
			if(data[i]%3==0) {
				count++;				
			}			
		}
		System.out.print(count);
		
		
		System.out.print("\n");
		
		
		//3의 배수의 합
		System.out.print("주어진 배열에서 3의 배수의 합=>");
		for(int i =1; i<data.length; i++) {
			if(data[i]%3==0) {
				sum = sum + data[i];}			
		}

		System.out.println(sum);
		
		
		sc.close();
		
	}

}
