package projects;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;

/*
As the name of the class should be Solution, using Solution.java as the filename is recommended.
In any case, you can execute your program by running 'java Solution' command.
*/
class Solution
{
	
	
	static int N;
	static int AnswerN;
	static int T;
	
	public static void main(String args[]) throws Exception
	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */
		File myFile = new File("C:\\Users\\DCarrion\\workspace\\Workspacess\\testProject\\src\\projects\\sample_input.txt");
		System.setIn(new FileInputStream(myFile));
		System.out.println(myFile.canRead());
		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			/*
     			Read each test case from standard input.
     		*/

			N = sc.nextInt();

			char[][] map = new char[N][N];
			for(int i = 0 ; i < N ; i++) {
				String tmp = sc.next();
				for(int j = 0 ; j < N; j++) {
					map[i][j] = tmp.charAt(j);
				}
			}
		
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				Please, implement your algorithm from this section.
				Your solution is to be stored in a variable called 'AnswerN'.
			*/
			/////////////////////////////////////////////////////////////////////////////////////////////
		    int counterA = 0;
			for (int i = 0; i < N; i++) {
				
				for (int j = 0; j < N; j++) {
					
					switch (map[i][j]) {
					case 'A':
						counterA++;
						break;
					case 'B':
					break;
					
					case 'C':
						break;
						
					case 'H':
					break;

					default:
						continue;
					}
				}
					
					
				}
				
				
			
			
				System.out.println("");
				


			// Print the answer to standard output(screen).
			System.out.println("#"+test_case+" "+AnswerN + "A count" + counterA);
		}
	}
}

