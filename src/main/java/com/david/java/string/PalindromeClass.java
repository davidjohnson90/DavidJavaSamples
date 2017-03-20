/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
public class PalindromeClass {
	
	public static void main(String[] args) {
		String s = "aba";
		s = compute(s);
		System.out.println(s);
	}

	static String compute(String s) {
        String t = "";
        int i = s.length() - 1;
        while(! checkPalindrome(t+s)){
            t = t + s.charAt(i);
            i --;
        }
        return t + s;
    }
	
	public static boolean checkPalindrome(String s){

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }

        return true;

    }

}
