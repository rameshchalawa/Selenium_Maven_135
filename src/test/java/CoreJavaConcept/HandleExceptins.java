package CoreJavaConcept;

//Refer FinallyBlock class for reference

import java.util.Scanner;

public class HandleExceptins {

	public static void main(String[] args) {
		
		 System.out.println("program is started....");
		 
		 Scanner sc=new Scanner(System.in);
		 
	     System.out.println("Enter a number:");	     
	     int num=sc.nextInt();
	     
	     try 
	     {
	         System.out.println(100/num);
	     }
	     catch(Exception e) 
	     {
	         System.out.println("Please Enter other than 0 number");
	         System.out.println(e.getMessage()); //it will print message why exception occurred
	     }
	     
	     System.out.println("Program is completed..");

	}

}
