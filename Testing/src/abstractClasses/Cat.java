package abstractClasses;

public class Cat extends Animal  {


	public Cat(){
		super(12);
		System.out.println("A cat has been created");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("A cat eats");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("A cat sleeps");
	}
	
	
	

	
}
