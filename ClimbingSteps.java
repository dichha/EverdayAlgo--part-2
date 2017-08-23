public class ClimbingSteps{
	public ClimbingSteps(){};
	public int numOfSteps(int n){
		if (n == 1)
			return 1;
		if (n == 2)
			return 2; 
		int a = 1; 
		int b = 2; 
		int c = 0; 
		while(n-2 > 0){
			c = a+b;
			a = b; 
			b = c; 
			n--;
		}
		return c; 
	}
	public static void main(String[] args){
		ClimbingSteps cs = new ClimbingSteps();
		int ans1 = cs.numOfSteps(4);
		int ans2 = cs.numOfSteps(10);
		System.out.print(ans1 + " " + ans2);
	}
}