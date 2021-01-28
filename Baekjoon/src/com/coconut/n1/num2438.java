package com.coconut.n1;

import java.util.Scanner;

public class num2438 {

	public static void main(String[] args) {
		// 문제 2438번/ 별찍기
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1; j<=i;j++) {
				
				System.out.println("*");
			}
			System.out.println();
			
		}
		
	}

}
