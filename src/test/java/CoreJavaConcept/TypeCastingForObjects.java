package CoreJavaConcept;

class Animal1{}

class Dog1 extends Animal1{}

class Cat extends Animal1{}

public class TypeCastingForObjects {

	public static void main(String[] args) {
		
		Animal1 an=new Dog1();
		Dog1 dg=(Dog1) an;     //Rule1-yes Rule2-yes Rule3=yes
		
		//Rule 1 : conversion is valid or not
        //The type of 'an' and '(Dog)' must have some relationship(either parent to child or child to parent

        //Rule2 : assignment is valid or not
        //'(Dog)' must be either same type or child of 'Dog'.

		//Rule3 :
		//The underlying object type of 'new Dog()' must be either same or child of '(Dog)'.

	}

}
