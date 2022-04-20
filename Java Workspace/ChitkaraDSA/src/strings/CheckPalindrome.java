package strings;

public class CheckPalindrome {

	static boolean checkPalindrome(String s)
	{
		s = s.toLowerCase();
		int l = 0;
		int r = s.length() - 1;
		while(l<r)
		{
			if(s.charAt(l) != s.charAt(r))
			{
				return false;
			}
			l++;
			r--;
		}
		//we reach this point -> loop did not return false -> String is Palindrome
		return true;
	}
	
	public static void main(String[] args) {
		String s = "ARORA";
		String s2 = "HellM";
		String s3 = "Malayalam";
		System.out.println(s + " is a palindrome: " + checkPalindrome(s));
		System.out.println(s2 + " is a palindrome: " + checkPalindrome(s2));
		System.out.println(s3 + " is a palindrome: " + checkPalindrome(s3));
	}

}
