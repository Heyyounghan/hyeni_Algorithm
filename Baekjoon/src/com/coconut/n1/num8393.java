package com.coconut.n1;

import java.util.Scanner;

public class num8393 {

	public static void main(String[] args) {
		// 백준8393번
		Scanner sc= new Scanner(System.in);
		//범위
		int count= sc.nextInt();
		int total= 0;
		for(int i=1; i<=count; i++) {
			total+=i;
		}
		System.out.println(total);

	}

}
