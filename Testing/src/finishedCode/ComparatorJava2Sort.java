package finishedCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to
 *  their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name 
 *  in alphabetical order. If those two students also have the same first name, then order them according to their ID. 
 *  No two students have the same ID.

 Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

 Input Format

 The first line of input contains an integer NN, representing the total number of students. 
 The next NN lines contains a list of student information in the following structure:


 The name contains only lowercase English letters. The IDID contains only integer numbers without leading zeros.
  The CGPA will contain, at most, 2 digits after the decimal point.

 Output Format

 After rearranging the students according to the above rules, print the first name of each student on a separate line.

 Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
 
 Sample Output

 Ashis
 Fahim
 Samara
 Samiha
 Rumpa*/
public class ComparatorJava2Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList,new StudentComparator());
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		
		Deque<Integer> myque = new ArrayDeque<Integer>();
		Set<Integer> mSet = new HashSet();
		
		mSet.clear();
		if (a.getCgpa() == b.getCgpa()) {

			if (a.getFname().equals(b.getFname())) {
				return a.getId() > b.getId() ? 1 : -1;
			}

			return a.getFname().compareTo(b.getFname()) > 0 ? 1 : -1;
		}
		return a.getCgpa() > b.getCgpa() ? -1 : 1;

		
	}
	
}