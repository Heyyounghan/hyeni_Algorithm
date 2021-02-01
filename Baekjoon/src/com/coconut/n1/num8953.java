package com.coconut.n1;

import java.util.Scanner;

public class num8953 {

	public static void main(String[] args) {
		// OX 계산하기.
		
		Scanner sc= new Scanner(System.in);
		//수 입력받기
		int n= sc.nextInt();
		//배열 선언하기. 
		String [] ch= new String[n];
		
		
		//TC의 개수
		for(int i=0;i<ch.length;i++) {
			int total= 0; // 누적값
			int count=0; // 연속횟수
			// 숫자 입력받기.
			ch[i]=sc.next();
			
			for(int j=0;j<ch[i].length();j++) {
				
				if(ch[i].charAt(j)=='O') {
					count++;					
				}
				else {
					count=0;
				} //else 
				
				total=total+count;
				
			}//작은 for문
			System.out.println(total);
		}// for문
		
			

	} // main

} // class
