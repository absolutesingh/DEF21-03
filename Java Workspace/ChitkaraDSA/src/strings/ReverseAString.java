package strings;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Hello";
		
		//Approach - 1
		String res = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			res = res + s.charAt(i); // Creating object again and again
		}
		//T.C. -> O(n)
		System.out.println("Reversed using Approach 1: " + res);
		
		//Approach - 2 [not creating objects again and again]
		char charArr[] = s.toCharArray();
		char newArr[] = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			newArr[s.length()-1-i] = charArr[i];
		}
		String res2 = new String(newArr);
		//T.C. -> O(n)
		//S.C. -> O(n)
				
		System.out.println("Reversed using Approach 2: " + res2);
		
		//Approach - 3
		int l = 0;
		int r = s.length() - 1;
		while(l<r)
		{
			char temp = charArr[l];
			charArr[l] = charArr[r];
			charArr[r] = temp;
			l++;
			r--;
		}
		//charArray has reversed elements now
		String res3 = new String(charArr);
		
		System.out.println("Reversed using Approach 3: " + res3);
		//T.C. -> O(n)
		//S.C. -> O(n)
		
	}

}
