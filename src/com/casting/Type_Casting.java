package com.casting;

public class Type_Casting {

	public static void main(String[] args) {
		System.out.println("WIDENING TYPECASTING");	
		byte a=100;
		short b=a;
        int c=b;
        float d=c;
        long e=c;
        double f=d;
        
        System.out.println("Before conversion value of a:"+a);
        System.out.println("After conversion value of b:"+b);
        System.out.println("After conversion value of d:"+c);
        System.out.println("After conversion value of d:"+d);  //Widening typecasting
        System.out.println("After conversion value of e:"+e); //lower to higher data type
        System.out.println("After conversion value of f:"+f);
        
        System.out.println("NARROWING TYPECASTING");        
        double g=1234;
        long h=(long) g;
        float i=(float) h;
        int j=(int) i;
        short k=(short) j;
        byte l=(byte) k;  
        
        System.out.println("Before conversion value of g:"+g);
        System.out.println("After conversion value of h:"+h);
        System.out.println("After conversion value of i:"+i);
        System.out.println("After conversion value of j:"+j);  // Narrowing typecasting
        System.out.println("After conversion value of k:"+k);  //Higher to lower data type
        System.out.println("After conversion value of l:"+l);      
	}

}
