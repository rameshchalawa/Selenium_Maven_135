package CoreJavaConcept;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        /*System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Given number is: "+num);
        */

        /*System.out.println("Enter decimal number:");
        double num=sc.nextDouble();
        System.out.println("Given value is: "+num);
        */

        System.out.println("Enter your city:");
        String city=sc.next();
        System.out.println("Your city is:"+city);

	}

}
