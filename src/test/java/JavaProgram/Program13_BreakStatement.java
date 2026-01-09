package JavaProgram;

public class Program13_BreakStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
        {
            if(i==5)    //As soon as this condition is satisfied, it will break the loop and rest of the value is not printed
            {
                break;
            }
            System.out.println(i);
        }

	}

}
