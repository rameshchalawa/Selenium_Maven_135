package CoreJavaConcept;

/*
1) Declare an array
2) add values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
*/

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		 // declaring array

        // Approach1
		
		/*int a[][]=new int[3][2];
		//int [][]a=new int[3][2];
		//int []a[]=new int[3][2];

		a[0][0]=100;
		a[0][1]=200;

		a[1][0]=300;
		a[1][1]=400;

		a[2][0]=500;
		a[2][1]=600;
		*/
		
		//Approach2
		int a[][]= {
		    {100,200},
		    {300,400},
		    {500,600}
		};

		//Find size of an array
		System.out.println("lenght of rows:"+a.length);
		System.out.println("lenght of columns:"+a[0].length);

		//read single value from an array
		//System.out.println(a[2][1]); //600

		//Read all values from Array
		//normal for loop
		
		/*for(int r=0;r<=a.length-1;r++) //0 1 2 3
		{
		    for(int c=0;c<=a[r].length-1;c++) //0 1 2
		    {
		        System.out.print(a[r][c]+" "); //100 200 300 400 500 600
		    }
		    System.out.println();
		}*/
		
		//enhanced for loop
		
		/*To debug how internally for loop working we can run java program in debug mode
		 right click on line number and select Toggle Breakpoint then Execute program Debug As Java Application instead of Run As java Application
		 To move next line enter F6 function key 
		 */

		for(int arr[] : a) //here, a represent array it will assign first row values(100 200) to array variable arr[]
		{
			for(int x:arr) //arr is having 100 200 first 100 will be assign to x, then x will print 100, then 200 will be assign to x, then x will print 200
				           //now, arr is empty it will go to outer for loop, array will assign next row values i.e. 300 400 so same process will happen
			{
				System.out.print(x+ " "); //100 200 300 400 500 600
			}
			    System.out.println();
		}

	}

}
