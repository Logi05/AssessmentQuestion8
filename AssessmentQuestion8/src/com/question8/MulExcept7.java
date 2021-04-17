package com.question8;

public class MulExcept7 {
	public static void main(String[] args) {
		 try {
	            /*int number[] = new int[20];
	            number[21] = 30 / 9;*/
	            int number1[] = new int[10];
	            number1[10] = 30 / 0;
	           
	        }
	        catch (ArrayIndexOutOfBoundsException
	               | ArithmeticException e) {
	            System.out.println(e);	            
	        }
	}
}
