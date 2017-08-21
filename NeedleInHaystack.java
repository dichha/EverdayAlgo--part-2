public class NeedleInHaystack{
	public int strStr(String haystack, String needle){
		int l1 = haystack.length();
		int l2 = needle.length();
		if(l1 < l2)
			return -1;
		else if (l2 == 0)
			return 0;

		int threshhold = l1-l2;
		for (int i=0; i<=threshhold; i++){
			if(haystack.substring(i, i+l2).equals(needle))
				return i;
		}
		return -1;
	}
	public static void main(String[] args){
		NeedleInHaystack nih = new NeedleInHaystack();
		int index1 = nih.strStr("abcdef", "cde");
		int index2 = nih.strStr("madseasonriverofdeceit", "season");
		int index3 = nih.strStr("season", "a");
		int index4 = nih.strStr("summerend", "");
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(index4);
	}
}