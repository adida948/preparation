package amazonProjects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Craete A'--> B' objects from A--> B objects
public class Person {
	private String name;
	private Person friend;
	
	public Person(String n){
		this.name = n;
		//this.friend = f;
	}
	
	public void setFriend(Person p){
		this.friend = p;
		
	}
	
	
	
	
public  Person deepCopy(){
	
	return deepCopy(this,new HashMap<Person, Person>());
	
	

}

public Person deepCopy( Person p, HashMap<Person,Person> order){
	if( order.containsKey(p)) return order.get(p);
	
	if(p.friend == null)
	{
	   Person lastPrimePerson = new Person(p.name);	
	   lastPrimePerson.setFriend(null);
	   return lastPrimePerson;
	}
	
	Person primerPerson = new Person(p.name);
	order.put(p, primerPerson);
	Person recursivePerson = deepCopy(p.friend,order);
	primerPerson.setFriend(recursivePerson);
	
	return primerPerson;
}
	
	public static void main(String[] args)
	{		
	    
		Person personB = new Person("Xavier");
		personB.setFriend(null);
		Person personA = new Person("Danilo");
		personA.setFriend(personB);
		
		Person friend = personA.deepCopy();
		
		System.out.println(friend.name);
	}
}


