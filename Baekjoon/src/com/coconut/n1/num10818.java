package com.coconut.n1;

import java.util.Scanner;

public class num10818 {

	public static void main(String[] args) {
		/**
		 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 * */
		
		Scanner sc= new Scanner(System.in);
		
		// n개의 정수
		int n = sc.nextInt();
		int [] arr= new int[n];
		int min = arr[0];  //최소
		int max = arr[0]; // 최대
		
		for(int i=0; i<arr.length;i++) {
			//숫자 입력하기.
			arr[i]= sc.nextInt(); 
			
			if(max<arr[i]) {
				max= arr[i]; //max보다 arr[i]이 크면 그게 최대
			
			if(min>arr[i]) {
				min= arr[i]; //최소보다 arr[i]가 크면 그게 최소 
			}
			}
		}
		
		
		
		System.out.println("최솟값:"+min);
		System.out.println("최댓값:"+max);
		

	}

}
