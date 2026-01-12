package CoreJavaConcept;

/* Primitive Data Types
byte, short, int, long ------> number without decimal
float, double --------> decimal number
char ----------> single character (single quote)
boolean ----> true/false

          DataType        Size        Description
--------------------------------------------------------
            byte        1 byte      Stores whole numbers from -128 to 127
            short       2 bytes     Stores whole numbers from -32,768 to 32,767
            int         4 bytes     Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long        8 bytes     Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            float       4 bytes     Stores fractional numbers. Sufficient for storing 7 decimal digits
            double      8 bytes     Stores fractional numbers. Sufficient for storing 15 decimal digits

            boolean     1 bit       Stores true or false values
            char        2 bytes     Stores a single character/letter
*/

public class DataTypes {

	public static void main(String[] args) {
		
		//Numeric data types
	    int a=100, b=200;
	    System.out.println("the value of a is :"+a);
	    System.out.println("the value of b is :"+b);
	    System.out.println(a+b);

	    System.out.println("the sum of a and b is:"+(a+b));

	    byte by=125;
	    System.out.println(by);

	    short sh=3535;
	    System.out.println(sh);

	    long l=1234567789L;    //literal is needed L/ l
	    System.out.println(l);
        
	    
	    float item_price=15.5F; // literal is needed F /f
	    System.out.println(item_price);

	    double dbl=1234.4343412;
	    System.out.println(dbl);

	    char grad='A';
	    System.out.println(grad);
	    
	    boolean b1=true;
	    System.out.println(b1);
	    
	}

}
