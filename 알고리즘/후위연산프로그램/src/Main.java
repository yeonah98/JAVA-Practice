import java.util.Scanner;

public class Main
{
	 static int Prec(char ch)
	    {
	        switch (ch)
	        {
	        case '+':
	        case '-':
	            return 1;
	      
	        case '*':
	        case '/':
	            return 2;
	      
	        case '^':
	            return 3;
	        }
	        return -1;
	    }
	    
	    static String infixToPostfix(String exp)
	    {
	        
	        String result = new String("");
	         
	      
	        ArrayStack<Character> stack = new ArrayStack<>();
	         
	        for (int i = 0; i<exp.length(); ++i)
	        {
	            char c = exp.charAt(i);
	             
	            
	            if (Character.isLetterOrDigit(c))
	                result += c;
	          
	            else if (c == '(')
	                stack.push(c);
	             
	            
	            else if (c == ')')
	            {
	                while (!stack.isEmpty() &&
	                        stack.peek() != '(')
	                    result += stack.pop();
	                 
	                    stack.pop();
	            }
	            else 
	            {
	                while (!stack.isEmpty() && Prec(c)
	                         <= Prec(stack.peek())){
	                   
	                    result += stack.pop();
	             }
	                stack.push(c);
	            }
	      
	        }
	      
	        while (!stack.isEmpty()){
	            if(stack.peek() == '(')
	                return "Invalid Expression";
	            result += stack.pop();
	         }
	        System.out.println("fix: " + result);
	       
	        ArrayStack<Integer> num = new ArrayStack<Integer>();
	        int r_len = result.length();
	        for(int i =0  ; i < r_len; i++)
			{
				char c = result.charAt(i); 
				if( '0'<=c && c <= '9')
					num.push(c - '0');
				else 
				{
					int num1 = num.pop();
					int num2 = num.pop();
					if(c == '*') num.push(num1*num2);
					else if(c == '-') num.push(num1-num2);
					else if(c == '+') num.push(num1+num2);
					else num.push(num1/num2);
				}
			}
			
			System.out.printf("%d\n", num.pop());
	        
	        return result;
	    }
	   
	    
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
			System.out.println("< 후위연산프로그램 >");
			String s = sc.nextLine();
			infixToPostfix(s);
			
	    }
}