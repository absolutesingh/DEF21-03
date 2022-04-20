package strings;

public class AnagramUsingOneFreqArray {

	static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length()) return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int freqArr[] = new int[26];
		
		for(int i=0;i<s1.length();i++)
		{
			char ch1 = s1.charAt(i);
			int index1 = ch1-'a'; //mapping character to index[with respect to 'a']
			freqArr[index1]++; //For String s1 -> Add in freq Array
			
			freqArr[s2.charAt(i) - 'a']--; //For String s2 -> Subtract from same freq Array
		}
		
//		frequency array has been created
		
		for(int i=0;i<26;i++) {
			if(freqArr[i]!=0) return false; //For anagrams -> the resultant array will have all elements as zero
		}
//		If reached here this means frequency array has all zeroes -> Hence, Anagrams
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
