package com.Exception_Handling;

public class Trycatch {
	
	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		String b="Deepak";
		System.out.println(a[2]);
		System.out.println(b);
        try {
        	try {
        		System.out.println(b.charAt(8));
        	}catch(Exception d) {
        		System.out.println("No character");
        		d.printStackTrace();
        	}
        	try {
        		System.out.println(a[4]);
        	}catch (Exception s){
        	System.out.println("The index is Higher than given index");
        	s.printStackTrace();
        	}
			System.out.println(a[1]/0);	
		} catch (Exception e) {
			System.out.println("Output is Infinity");
			e.printStackTrace();
			
		}
        finally {
        	System.out.println("***Processing***");
        }
        
		

	}

}
