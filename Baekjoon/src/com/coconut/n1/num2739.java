package com.coconut.n1;

import java.util.Scanner;

public class num2739 {

	public static void main(String[] args) {
		//백준 2739번 
		
		Scanner sc= new Scanner(System.in);
		//입력받을 n
		int n= sc.nextInt();
		
		for(int i=1;i<10;i++) {
			int result= n*i;
			System.out.println(n+"*"+i+"="+result);
		}
		

	}

}
