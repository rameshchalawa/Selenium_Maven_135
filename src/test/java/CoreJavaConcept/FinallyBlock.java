package CoreJavaConcept;

//Refer CheckedExceptions class for how to handle checked Exception

/*
Finally block is optional block it always execute whether you get Exception or not
case1: Exception occurred, catch block handled ----> finally block will execute
case2: Exception occurred, catch block NOT handled --> finally block will execute
       (If Exception Type is not matching then catch block will not handle Exception)
case3: Exception does not occurred, catch block ignored ----> finally block will execute
 */

public class FinallyBlock {

	public static void main(String[] args) {
		
	     String s = null;
	        try 
	        {
	            System.out.println(s.length());
	        }
	        catch(NullPointerException e) 
	        {
	            System.out.println("Catch block handled exception......");
	            System.out.println(e.getMessage());
	        }
	        finally 
	        {
	            System.out.println("you entered into finally block......");
	        }
	        System.out.println("Program finished..............");

	}

}
