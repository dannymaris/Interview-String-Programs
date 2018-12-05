package org.danny.stringprograms;

class WithoutInbuiltReverseCommand{
	public static void main(String[] args) {
		String string ="I Love Programming";
		char[] ch = string.toCharArray();
		for(int i=string.length()-1;i>=0;i--) 
			System.out.print(string.charAt(i));
	}
}
		