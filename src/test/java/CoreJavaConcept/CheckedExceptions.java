package CoreJavaConcept;

/*
Checked exceptions - these are the exceptions that are checked at compile time. If these exceptions are not handled properly, 
then the program will not compile. These exceptions are also known as compile-time exceptions.
Examples of checked exceptions include:
1. IOException - This exception is thrown when there is an input/output error, such as when a file cannot be found or read.
2. ClassNotFoundException - This exception is thrown when a class cannot be found, such as when trying to load a class that does not exist.
3. InterruptedException - This exception is thrown when a thread is interrupted while it is sleeping, waiting, or otherwise occupied.
4. SQLException - This exception is thrown when there is an error with a database access, such as when a SQL query fails.
5. FileNotFoundException - This exception is thrown when a file cannot be found, such as when trying to read a file that does not exist.
 */

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		
		 System.out.println("program started......");
	        System.out.println("program in progress...........");
	        
	        Thread.sleep(2000);
	              
	        /*try 
	          {
	            Thread.sleep(2000);
	          }
	        catch(InterruptedException e) 
	        {
	        
	        }*/
	        
	        System.out.println("program finished...");

	}

}
