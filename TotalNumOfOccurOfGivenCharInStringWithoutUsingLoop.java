package org.danny.stringprograms;

public class TotalNumOfOccurOfGivenCharInStringWithoutUsingLoop {
	    public static void main(String[] args) {
	        String str = "i love java and i love to code on java";
	        System.out.println("Length Of String:" + str.length());
	        System.out.println("Length Of String Without j :" + str.replace("j", "").length());
	        int charcount = str.length() - str.replaceAll("j", "").length();
	        System.out.println("Occurrence Of J Char In String: " + charcount);
	    }
	}


