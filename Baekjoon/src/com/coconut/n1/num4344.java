package com.coconut.n1;

import java.util.Scanner;

public class num4344 {

	public static void main(String[] args) {
		//평균구하기
		
		Scanner sc= new Scanner(System.in);
		
		//테스트 케이스 갯수 C
		int c= sc.nextInt();
		
		//각 테스트 케이스마다 학생의 수 1<N<1000가 출력된다.
		//점수 넣기
		
		int [] score= new int[c];
		//이어서 N명의 점수가 주어진다. 0~100
		
		double avg=0;
		
		for(int i=0;i<score.length;i++) {
			score[i]= sc.nextInt();	 // 번호 입력하기.
		}

		for(int i=0;i<score.length;i++) {
			avg= avg+score[i];
			
		}
	
		//평균점수 출력하기. 
	
		System.out.println(c+" "+(avg/c)+"%");
	

	}

}
