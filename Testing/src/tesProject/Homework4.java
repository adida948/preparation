package tesProject;
import java.util.Random;

/*
|||||||||||||||||||||||
Danilo Carrion 
11-07-11
CS 340 
Homework 4 
Lecturer: Simina Fluture, PhD
*/
public class Homework4
{    
   private static long startTime = 0;// Keeps track of starting time
   
   public static void main(String[] args)
   {        
       
       // We create class objects to create new threads
       FirstThread firstThread = new FirstThread();
       SecondThread secondThread = new SecondThread();
       ThirdThread thirdThread = new ThirdThread();
       
       //  We use start to begin executing the threads.
       firstThread.start();
       secondThread.start();
       thirdThread.start();    
       
       startTime = System.currentTimeMillis();// we get the current time as the inital time
       
   }
   
   // This method shows what each thread will display in the console
   public synchronized void StartRunning()
   {        
       while(true)  // Since it is a while true loop, it will keep running until we stop it.
       {
           System.out.println("Hello, I am the " + Thread.currentThread().getName() + " , I am currently running and  I'm " + age() + " miliseconds old");            
       }
   }
   
   // Method provided in Homework
   protected static final long age() {
       return System.currentTimeMillis() - startTime;
       }
   
}

// FirstThread class which extends thread
class FirstThread extends Thread
{    
   // Variables to hold sleep and random number information.
     Random ranNumOne = new Random();
    int sleepOne = 0;
	
   // variable to access the StartRunning method
   Homework4 XfirstThread = new Homework4();
   
   public void run()
   {
	  //Sets name of thread. 
       setName("First Thread");
       
       // The following line of code generates a a random sleep time between 1-5 
	   // seconds
	   
	    sleepOne = (ranNumOne.nextInt(5) + 1)*1000;
    
	    try {
           Thread.sleep(sleepOne); //  Makes the thread sleep
        } 
		catch (InterruptedException e) {
           
           e.printStackTrace();
       }
       
       
       XfirstThread.StartRunning();  // Calls class method to start running.     
   }
       
}

// The two classes bellow do the same as the previos class --> all the comments apply. 

class SecondThread extends Thread
{

   Random ranNumTwo = new Random();
   int sleepTwo = 0;

   
   Homework4 XsecondThread = new Homework4();
   
   public void run()
   {
       setName("Second Thread");
    
       sleepTwo = (ranNumTwo.nextInt(5) + 1)*1000;
       try {
           
           Thread.sleep(sleepTwo);
       } catch (InterruptedException e) {
           
           e.printStackTrace();
       }
       
       XsecondThread.StartRunning();        
   }    
}

class ThirdThread extends Thread
{        

   Random ranNumThree = new Random();
   int sleepThree = 0;
   
  
   Homework4 XthirdThread = new Homework4();
   
   public void run()
   {
       setName("Third Thread");
       
       sleepThree = (ranNumThree.nextInt(5) + 1)*1000;
       try {
           
           Thread.sleep(sleepThree);
       } catch (InterruptedException e) {
           
           e.printStackTrace();
       }
       
       XthirdThread.StartRunning();        
   }    
}
