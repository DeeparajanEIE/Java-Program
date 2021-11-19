package com.Impotant_Programs;

public class Fibnacci_series {

	public static void main(String[] args) {
		int i = 0;
		int f = 0;
		int s = 1;
		//t=f+s
		//first f=0,s=1 t=0+1=1
		// f=s,s=t f=1,s=1 t=1+1=2 then continue

		for (i = 0; i < 50; i++) {
			System.out.println(f);
			if(f==10946) {
				break;
			}
			
			int t = f + s;
			f = s;
			s = t;
			

		}

	}

}
