package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		//로또 생성기(숫자 중복x)
		
		//배열 생성
		int[] lo = new int[6];
		
		
		//랜덤 값 출력
		for(int i = 0; i<lo.length; i++) {
			
			lo[i] = (int)((Math.random()*45)+1);

				
			for(int j =0; j<i; j++) {
				if(lo[i]== lo[j]) {
					i--; break;
					}
				}//작은 for
				
	 }//큰 for
		
		for(int i = 0; i<lo.length; i++) {
		System.out.print(lo[i]+"\t");}
	}

}
