package JavaProgram;

/*
 
 Arrays - Array is collection of elements of same data type (Homogenios data).
We can store multiple values into a single variable.
 
1) Declare an array
2) add values into array
3) Find length of an array
4) read single value from an array
5) read multiple values from an array
*/

public class Program17_SingleDimensionalArray {

	public static void main(String[] args) {
		
		//Declare an array
		int a[]={100,200,300,400,500};

		//find length of an array
		System.out.println("Length of an array:"+a.length);

		//read single value from an array
		System.out.println(a[4]); // here 4 is index

		//reading all the values from array
		
		//Normal for loop
		/*for(int i=0; i<a.length;i++)     // i<=4   i<5   i<=a.length-1   i<a.length
		{
		  System.out.println(a[i]); //100 200 300 400 500
		}
		*/

		//enhanced for loop/ for..each loop
		for(int x:a)
		{
		  System.out.println(x);
		}

	}

}
