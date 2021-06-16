package day7;

public class AnimalMain {

	public static void main(String[] args) {
		Animal obj1 = new Cat();
		obj1.talk();
		obj1.respirate();
		
		Animal obj2 = new Dog();
		obj2.talk();
		obj2.respirate();
		
		Animal[] am= new Animal[2];
	       am[0]=new Dog();
	       am[1]=new Cat();
	      // am[2]=new Lion();
	       
	       for(Animal a:am) {
	    	   a.talk();
	    	   a.respirate();
	       }
	}		
}
