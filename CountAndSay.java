public class CountAndSay{
	CountAndSay(){};
	public String countAndSay(int n){
		StringBuilder curr = new StringBuilder("1");
		StringBuilder prev;
		int count;
		char say; 
		for(int i=1; i< n; i++){
			prev = curr; 
			curr = new StringBuilder();
			count = 1; 
			say = prev.charAt(0);
			int len = prev.length();
			for(int j=1; j<len; j++){
				if(prev.charAt(j) != say){
					curr.append(count).append(say);
					say = prev.charAt(j);
					count = 1;
				}else{
					count++;
				}				
			}
			curr.append(count).append(say);
		}
		return curr.toString();
	}
	public static void main(String[] args){
		CountAndSay cas = new CountAndSay();
		String nthCountAndSay = cas.countAndSay(7);
		System.out.println("4th count and say: " + nthCountAndSay);
	}
}