package test;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("< ListStack >");
		String s = sc.nextLine();
		String y = isBalanced(s);
		System.out.println(y);
	}
	static String isBalanced(String s)
	{
		String result = "NO";
		ListStack<String> ls = new ListStack<String>();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
	        {
				ls.push(Character.toString(s.charAt(i)));
			}
			
			else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
			{
				if(ls.size() != 0 && ls.peek().equals("(") && s.charAt(i) == ')')
				{
					ls.pop();
				}
				else if(ls.size() != 0 && ls.peek().equals("{") && s.charAt(i) == '}')
				{
					ls.pop();
				}
				else if(ls.size() != 0 && ls.peek().equals("[") && s.charAt(i) == ']')
				{
					ls.pop();
				}
				else
				{
					return result = "NO";
				}
			}
			
		}
		if(ls.isEmpty() == true)
		{
			return result = "YES";
		}
		return result;
	}
}