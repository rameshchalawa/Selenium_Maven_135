package CoreJavaConcept;

/*
finalize() is a method defined in the Object class that is called by the Garbage Collector (GC) just before an object is destroyed/removed from memory.
Finalize method is used to perform clean up activity before object is destroyed by Garbage Collector.
Garbage Collector is a process which automatically destroys the objects which are not in use to free up memory.
Note: Finalize method is deprecated in Java 9 and later versions, and it is generally recommended to avoid using it 
due to its unpredictability and potential performance issues.
 */

public class FinalizeMethod {
	
	// Called by GC before object is destroyed
    @Override
    protected void finalize() throws Throwable 
    {
        System.out.println("finalize() called - Object is being destroyed!");
    }

	public static void main(String[] args) throws Exception
	{
		FinalizeMethod obj1 = new FinalizeMethod();
		FinalizeMethod obj2 = new FinalizeMethod();
		
		// Nullify references to make objects eligible for GC
		obj1 = null;
		obj2 = null;
		
		// Suggest GC to run (not guaranteed)
		System.gc();
		
		System.out.println("Main method finished. Waiting for GC to call finalize()...");
		
		

	}

}
