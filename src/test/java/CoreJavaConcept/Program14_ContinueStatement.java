package CoreJavaConcept;

/*
 control statements
1. conditional statements ---- if, if-else, nested ifelse, switchcase
2. looping/iteratice statements --- while, do-while, for loop
3. jumping statemetns -- break, continue 
 */

public class Program14_ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
        {
            if(i==3 || i==5 || i==9) //As soon as condition satisfied it will go to continue and value will be incremented hence these value will be skipped 
            {
                continue;
            }
            System.out.println(i);
        }
		

	}

}
