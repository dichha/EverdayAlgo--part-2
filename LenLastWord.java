public class LenLastWord{
	LenLastWord(){};
	public int lengthOfLastWord(String s){
		String str = s.trim();
		if(str.length() == 0)
			return 0;
		else{
			String[] words = str.split(" ");
			int len = words[words.length-1].length();
			return len;
		}
	}
	public static void main(String[] args){
		LenLastWord llw = new LenLastWord();
		int ans = llw.lengthOfLastWord("  Meaning of life is forty-two  ");
		System.out.println("Last word length is: " + ans);

	}
}