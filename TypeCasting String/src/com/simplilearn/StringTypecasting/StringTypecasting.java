package com.simplilearn.StringTypecasting;

import java.util.Scanner;

public class StringTypecasting {

	public static void main(String[] args) {
		
		System.out.println("Enter any string : ");
		
		Scanner stringInput = new Scanner(System.in);
		
		String strValue = stringInput.next();
		
		System.out.println("Converting string value to other data types");
		
		System.out.println("Data type of value before typecasting : "+strValue.getClass().getSimpleName());
		
		int intValue=Integer.parseInt(strValue);
		
		float floatValue = Float.parseFloat(strValue);
		
		double doubleValue = Double.parseDouble(strValue);
		
		long longValue = Long.parseLong(strValue);
		
		short shortValue = Short.parseShort(strValue);
		
		byte byteValue = Byte.parseByte(strValue);
		
		System.out.println("Value of String after typecasting to Integer :"+ intValue);
		System.out.println("Value of String after typecasting to Float :"+ floatValue);
		System.out.println("Value of String after typecasting to Double :"+ doubleValue);
		System.out.println("Value of String after typecasting to Long :"+ longValue);
		System.out.println("Value of String after typecasting to Short :"+ shortValue);
		System.out.println("Value of String after typecasting to Byte :"+ byteValue);
		
	
		
	}

}
