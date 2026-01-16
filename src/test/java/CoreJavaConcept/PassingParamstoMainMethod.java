package CoreJavaConcept;

//Run As Run Configurations... and click on Arguments to pass parameters

public class PassingParamstoMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
        for(String value:args)
        {
            System.out.print(value);
        }

	}

}
