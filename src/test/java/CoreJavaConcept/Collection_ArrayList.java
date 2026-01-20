package CoreJavaConcept;

/*
ArrayList - is class which is implemented List interface
1. Heterogeneous data - allowed
2. Insertion order- preserved(Index)
3. Duplicate elements -- allowed
4. multiple nulls -- allowed
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_ArrayList {

	public static void main(String[] args) {
		
        ArrayList mylist=new ArrayList();

        //Adding data into arraylist
 
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        //Size of Arraylist
        System.out.println("Size of ArrayList :"+mylist.size()); //size() method
        
        //Printing ArrayList
        System.out.println("Printing data from ArrayList :"+mylist); //by using object
        
        //Remove element from ArrayList
        mylist.remove(5); // 5 is index of element
        System.out.println("After removing :"+mylist);
        
        //Insert element in the ArrayList
        mylist.add(2, "java");
        System.out.println("After Insertion :"+mylist);
        
        //Modify element in the ArrayList
        mylist.set(2, "python");
        System.out.println("After Replacing :"+mylist);
        
        //Access specific element from ArrayList
        System.out.println(mylist.get(3)); // 3 is index 
        
        //Reading all the elements from ArrayList
        
        //Using for loop
        
       /* for(int i = 0; i<mylist.size(); i++) {
        	System.out.print(mylist.get(i)+" ");
        }*/
        
        
        //Using Enhanced for loop
        
       /* for(Object x:mylist) {
        	System.out.print(x+" ");
        }*/
        
        //using iterator
        Iterator it = mylist.iterator();
        
        while(it.hasNext()) //hasNext() method checks next element is exist or not in ArrayList
        {
        	System.out.print(it.next()+" "); //next() method will read the next element from ArrayList
        }
        
        //Checking ArrayList is Empty or not
        System.out.println();
        System.out.println(mylist.isEmpty()); //false
        
        //Remove multiple elements randomly from ArrayList
        ArrayList mylist2=new ArrayList(); //To remove multiple element from ArrayList, we need to create new ArrayList consisting of removing element
        mylist2.add(100);
        mylist2.add("welcome");
        
        mylist.addAll(mylist2);        //here addAll method merge the 2 Arraylist
		System.out.println(mylist);    //[100, 10.5, python, welcome, A, true, null, null, 100, welcome]
		
		//mylist.retainAll(mylist2);     //retainAll method only retain common elements from both Arraylist
		//System.out.println(mylist);    //[100, welcome, 100, welcome]
        
        mylist.removeAll(mylist2);
        System.out.println("After removing multiple element from ArrayList :"+mylist); //[10.5, python, A, true, null, null]
        
        //Remove All the element or clear ArrayList
        mylist.clear();
        System.out.println(mylist.isEmpty()); //true
        
        
        
        
    }
}
