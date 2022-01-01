import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("< ArrayStack >");
		String s = sc.nextLine();
		String y = isBalanced(s);
		System.out.println(y);
	}
	static String isBalanced(String s)
	{
		String result = "NO";
		ArrayStack<String> as = new ArrayStack<String>();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
	        {
				as.push(Character.toString(s.charAt(i)));
			}
			
			else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
			{
				if(as.size() != 0 && as.peek().equals("(") && s.charAt(i) == ')')
				{
					as.pop();
				}
				else if(as.size() != 0 && as.peek().equals("{") && s.charAt(i) == '}')
				{
					as.pop();
				}
				else if(as.size() != 0 && as.peek().equals("[") && s.charAt(i) == ']')
				{
					as.pop();
				}
				else
				{
					return result = "NO";
				}
			}
			
		}
		if(as.isEmpty() == true)
		{
			return result = "YES";
		}
		return result;
	}
}