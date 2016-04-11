package abstractClasses;


public abstract class Animal {
	private int age;
	
	public Animal(int ag){
		this.age = ag;
		System.out.println(age + " year old animal has been created");
	}
	
	  public void sleep() {
	        System.out.println("An animal is sleeping");
	    }
	
	public abstract void eat();
	
	public int getAge(){
		return this.age;
	}
	
	
	public static void main(String[] args){
		
		Dog d = new Dog();
        d.sleep();
        d.eat();
        
        Cat c = new Cat();
        c.eat();
        c.sleep();
        
		//Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();
        
        Object str = "est";
        String realS = (String) str;
        realS.getBytes();
        
        // What happens when...
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
        	//Even though we cast it from animal to doggy
        	//the overriden methos are persovered with this casting
        	//By casting we can see all the methods from the Animal class
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    
	}

}
