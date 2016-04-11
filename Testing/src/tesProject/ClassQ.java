package tesProject;

class A {
  private String myData = "";
  
 


	public String myName() {
		return this.myData;
	}
}

public class ClassQ extends A {

	ClassQ(String data) {
		// TODO Auto-generated constructor stub
	}

	int getValue() {

		int a = true ? null : 0;

		return a;
	}

	public String myName() {
		return "ssss";
	}

	public int myName(int b) {
		return b;
	}

	public static void main(String[] args) {

		//ClassQ obj = new ClassQ();
		// obj.getValue();

		Integer i1 = 128;
		Integer i2 = 128;

		System.out.println(i1 == i2);

		Integer i3 = 127;
		Integer i4 = 127;

		System.out.println(i3 == i4);

		// System.out.println(null);
		
		

		try {
			int data = 50 / 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		System.out.println("rest of the code...");

		A myClass = new A();
		System.out.println(myClass.myName());
		
	   // A mySubClass = new ClassQ();
	    //System.out.println(mySubClass.myName());
	}

}
