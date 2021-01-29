package com.coconut.n1;

import java.util.Scanner;

public class num10952 {

	public static void main(String[] args) {
		// 백준 10952번
		Scanner sc= new Scanner(System.in);

		System.out.println("두 정수를 입력하세요.");

		boolean check=true;

		while(check) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			int total= a+b;

			System.out.println(total);
			
			
			if(total == 0) {
				check=false;
			}

		}


	}

}
