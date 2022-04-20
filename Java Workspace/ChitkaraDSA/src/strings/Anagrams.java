package strings;

public class Anagrams {

	static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length()) return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int freqArr1[] = new int[26];
		int freqArr2[] = new int[26];
		
		for(int i=0;i<s1.length();i++)
		{
			char ch1 = s1.charAt(i);
			int index1 = ch1-'a'; //mapping character to index[with respect to 'a']
			freqArr1[index1]++; //For String s1
			
			freqArr2[s2.charAt(i) - 'a']++; //For String s2			
		}
//		frequency arrays have been created
		
		for(int i=0;i<26;i++) {
			if(freqArr1[i]!=freqArr2[i]) return false;
		}
//		If reached here this means frequency arrays are equal
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("CAT","TAC"));
		System.out.println(isAnagram("CAT","TAG"));
		System.out.println(isAnagram("CAT","TACC"));
		System.out.println(isAnagram("GOD","GOD"));
		System.out.println(isAnagram("INTEGRAL","Triangle"));
	}

}
