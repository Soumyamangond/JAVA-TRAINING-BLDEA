package java_training_bldea;

import java.util.Scanner;

public class Text7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input:We Love RCB
		//output:ew evoL BCR

				
			    //step-1
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the string:");
				String str=sc.nextLine();
				String str_tmp="";
				
						
				//STEP-2
				int count=0;
				for(int i=0;i<str.length();i++ ) {
					if(str.charAt(i)==' '|| i==str.length()-1) {
						count++;
						
					}
				
			}
		       System.out.println("word count :" +count);
		       
		       //step-3
		       String arr[]=new String[count];
		       
		       int tmp=0;
			//step-4
		       for(int i=str.length()-1;i>=0;i--) {
		      
		    	   //step-5
		    	   if (str.charAt(i)!=' ') {
		    		   str_tmp=str_tmp+str.charAt(i);
		    		   
		    	   }
		    	   
		    	   else {
		    		   arr[tmp] = str_tmp;
		    		   tmp++;
		    		   str_tmp="";
		    	   }
		    	   
		    	   }
		       arr[tmp] = str_tmp;
		       
		       //step-6
		       for(int i=arr.length-1;i>=0;i--) {
		    	   System.out.println(arr[i]+" ");
		    	   
		       }
			
			}

}
