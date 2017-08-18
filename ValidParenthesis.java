import java.util.Stack; 

public class ValidParenthesis{
	public ValidParenthesis(){}
	public boolean isValid(String parens){
		Stack<Character> stack = new Stack<Character>();
		char[] chars = parens.toCharArray();
		for(char c: chars){
			if(c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop() != c)
				return false;
		} 
		return stack.isEmpty();

	}
	public static void main(String[] args){
		//String parenChars = "(){}[][]{}()";
		//String parenChars = "({({})})";
		String parenChars = "{{{)";
		System.out.println(parenChars);
		ValidParenthesis vp = new ValidParenthesis();
		boolean ans = vp.isValid(parenChars);
		System.out.println(ans);

	}
}