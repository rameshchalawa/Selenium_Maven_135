package CoreJavaConcept;

/*
 which loop is preferred to use
- If you know the number of iterations in advance, the for loop is often the most suitable.
- If you want to execute the loop at least once, the do-while loop is appropriate.
- If you are uncertain about the number of iterations and the loop termination is based on a condition, the while loop is a good choice.
 */

public class Program12_ForLoop {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
		}
		*/

		//10.....1 desc
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}

	}

}
