package abstractClasses;

public class Dog extends Animal {

	public Dog() {
		super(34);
		// TODO Auto-generated constructor stub
        System.out.println("A dog has been created.");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("A dog eats");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("A dog sleeps");

	}
	
	
	public void ruff(){
		System.out.println("Dog says ruff");
	}

}
