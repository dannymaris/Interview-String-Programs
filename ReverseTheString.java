package org.danny.stringprograms;

class ReverseTheString{
	public static void main(String[] args) {
		String string = "I Love Programming";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
	}
}