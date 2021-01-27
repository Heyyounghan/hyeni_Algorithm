package com.coconut.n1;

import java.util.Scanner;
public class num2884 {

	public static void main(String[] args) {
		// 알람시간 
		
		Scanner sc= new Scanner(System.in);
		
		//0 ≤ H ≤ 23, 0 ≤ M ≤ 59
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		
		if(m<45) {
			h--; //시 감소 45분을 감소하면 시가 바뀜
			m= 60-(45-m); // 분 감소
			
			if(h<0) { // 시가 0보다 작다면 23으로.. 
				h=23;
			}
			
			System.out.println(h+" "+m);
		}else {
			System.out.println(h+" "+(m-45));
			
		}
			
	

	}

}
