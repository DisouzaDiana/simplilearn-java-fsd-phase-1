package typecasting.com.simplilearn.typecasting;
import java.util.Scanner;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Implicit Typecasting");
		System.out.println("Enter Number");
		Scanner byteinput  = new Scanner(System.in);
		
		byte byteValue = byteinput.nextByte();
		
		System.out.println("byte value :"+byteValue);
		
		short shortValue = byteValue;
		
		int intVal = shortValue;
		
		long longVal = intVal;
		
		float floatVal = longVal;
		
		double doubleVal = floatVal;
		
		System.out.println("Short Value  :"+shortValue);
		System.out.println("Integer Value  :"+intVal);
		System.out.println("Long Value  :"+longVal);
		System.out.println("Float Value  :"+floatVal);
		System.out.println("Double value :"+doubleVal);
		
		
		

	}

}
