package CoreJavaConcept;

//We can achieve polymorphism by using ConstructorOverloading

public class ConstructorOverloading {
	
	double width, height, depth;

	ConstructorOverloading()   //1
    {
        /*width=0;
        height=0;
        depth=0;*/
        width=height=depth=0;
    }

	ConstructorOverloading(double w, double h, double d)   //2
    {
        width=w;
        height=h;
        depth=d;
    }

	ConstructorOverloading(double len) //3
    {
        width=height=depth=len;
    }

   double volume()
   {
       return(width*height*depth);
   }


	public static void main(String[] args) {
		
		//ConstructorOverloading c=new ConstructorOverloading(); //1
	    //ConstructorOverloading c1=new ConstructorOverloading(10.5,15.5,5.0);//2
		ConstructorOverloading c2=new ConstructorOverloading(10.5); //3
	    System.out.println(c2.volume());
		

	}

}
