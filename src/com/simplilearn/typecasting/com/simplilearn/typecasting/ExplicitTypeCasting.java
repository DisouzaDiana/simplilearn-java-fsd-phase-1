package typecasting.com.simplilearn.typecasting;

import java.util.Scanner;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		System.out.println("Implicit Typecasting");
		System.out.println("Enter Number");
		Scanner doubleInput  = new Scanner(System.in);
		
		double doubleVal = doubleInput.nextDouble();
		
		System.out.println("Double Value :"+doubleVal);
		
		float floatVal = (float) doubleVal;
		
		long longVal = (long)floatVal;
		
		int intVal = (int) longVal;
		
		short shortVal = (short) intVal;
		
		byte byteVal = (byte)shortVal;
		
		//System.out.println("Double value :"+doubleVal);
		System.out.println("Float Value  :"+floatVal);
		System.out.println("Long Value  :"+longVal);
		System.out.println("Integer Value  :"+intVal);
		System.out.println("Short Value  :"+shortVal);
		System.out.println("Byte Value  :"+byteVal);
				
		
		
	}

}
