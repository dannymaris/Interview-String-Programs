package org.danny.stringprograms;

public class ConvertStringToIntAndIntToString {
	/*To Convert String To Integer Using Integer.parseInt() method :*/
	 public static void main(String[] args) 
	    {
	        String s1 = "2015";
	         
	        int i1 = Integer.parseInt(s1);
	         
	        System.out.println(i1);          //Output : 2015
	        
	        
	 /* To Convert String To Integer Using Integer.valueOf() method :*/
	        String s2 = "2015";
	         
	        int i2 = Integer.valueOf(s2);
	         
	        System.out.println(i2);          //Output : 2015
	        
	 /* To Convert Integer To String Using Integer.toString() Method :*/
	        int i3 = 2015;
	         
	        String s3 = Integer.toString(i3);
	         
	        System.out.println(s3);     //Output : 2015
	        
	  /* To Convert Integer To String Using String.valueOf() method :*/
	        {
	            int i4 = 2015;
	             
	            String s4 = String.valueOf(i4);
	             
	            System.out.println(s4);     //Output : 2015
	        }
	    }
}


   


