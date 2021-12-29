package 자료구조및알고리즘_스택;
import java.util.Scanner;

class ArrayStack{
	char[] stack;
    int top;

    public ArrayStack(int size) {
        stack = new char[size];
        this.top = -1;
    }

    public void push(char data) {
        stack[++top] = data;
    }

    public char pop() {
        return stack[top--];
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }
}

public class 실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
	        ArrayStack stack = new ArrayStack(input.length());

	        int loopCount = 0;
	        for (loopCount = 0; loopCount < input.length(); loopCount++) {
	            char ch = input.charAt(loopCount);
	            boolean isIncorrect = false;

	            switch (ch) {
	            case '(': case '{': case '[':
	                stack.push(ch);
	                break;

	            case ')':
	                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
	                    isIncorrect = true;
	                }
	                break;

	            case '}':
	                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
	                    isIncorrect = true;
	                }
	                break;

	            case ']':
	                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
	                    isIncorrect = true;
	                }
	                break;
	            }
	            
	            if(isIncorrect) {
	                break;
	            }
	        }
	        
	        if(stack.isEmpty() && loopCount == input.length()) {
	            System.out.println("Yes");
	        }
	        else {
	            System.out.println("No");
	        }
	}
}