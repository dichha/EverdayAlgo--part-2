public class Sqrt{
	Sqrt(){};
	public int getSqrt(int x){
		long r = x;
		while(r*r > x){
			r = (r+x/r)/2;
		}
		return (int)r;
	}
	public static void main(String[] args){
		Sqrt s = new Sqrt();
		int ans1 = s.getSqrt(50);
		int ans2 = s.getSqrt(16);
		System.out.println(ans1 + " " + ans2);
	}
}