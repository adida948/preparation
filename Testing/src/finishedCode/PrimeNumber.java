package finishedCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

// print prime numbers
/*
 * 
INPUT
2
1
3
4
5
OUTPUT
2 
2 
2 3 
2 3 5 

*/public class PrimeNumber {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<String>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class Prime {

	public void checkPrime(int... param) {
		
		String primeList = "";
		for (int i = 0; i < param.length; i++) {
			
			boolean isNotPrime = false;
		
			for (int j = 2; j <= Math.sqrt(param[i]); j++) {
				
				if(param[i]%j == 0){
					isNotPrime = true;
					break;
				}
			}
			
			if( param[i] > 1 && (!isNotPrime || param[i] == 2))
				primeList += param[i]+" ";
		}
		
		System.out.println(primeList);


	}

}
