package java_training_bldea;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

		public static void main(String[] args) {
			//step-1
			Scanner sc=new Scanner(System.in);
			System.out.println("String-1:");
			String s1=sc.next();
			System.out.println("String-2:");
			String s2=sc.next();
			//step-2
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			//step-3
			Arrays.sort(c1);
			Arrays.sort(c2);
			//step-4
			if(Arrays.equals(c1,c2)) {
				System.out.println("Anagram");
				
			}
			else {
				System.out.println("not Anagarm");
			}
			
		
		// TODO Auto-generated method stub

	}

}
