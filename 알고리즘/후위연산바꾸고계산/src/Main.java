import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc =1 ; tc<=10; tc ++)
		{
			int N = Integer.parseInt(br.readLine());
			// 중위표기 입력 받고 후위표기할 String 선언.
            		String midfix = br.readLine();
			String postfix = "";
			
			ArrayStack<Character> op = new ArrayStack<Character>();
			ArrayStack<Integer> num = new ArrayStack<Integer>();
            
			// 중위에서 후위로. but +,* 한정.
			for(int i  =0 ; i < N ; i++)
			{
				char c = midfix.charAt(i);
				if( '0'<=c && c <= '9') // 숫자는 이어서 붙여줌.
					postfix+=c;
				else 
				{
					if(c == '*') op.push(c); // 우선 순위가 더 높으니까 바로 붙여줌. 
					else // + 일경우  
					{
						while(!op.isEmpty() && (op.peek() =='*'|| op.peek() == '+')) // 낮은게 분명해서 기존에 넣어뒀던 * 먼저 하기 위해 후위연산에 붙여줌.
						{
							postfix +=op.pop();
						}
						op.push(c); // 그후 + 넣어줌.
					}
					
				}
			}
			while(!op.isEmpty()) postfix +=op.pop(); // 남은 연산자들 넣어줌.
			
//			System.out.println(postfix.toString());
			// 후위연산 계산.
			for(int i =0  ; i < N ; i++)
			{
				char c = postfix.charAt(i); 
				if( '0'<=c && c <= '9')
					num.add(c - '0');
				else 
				{
					int num1 = num.pop();
					int num2 = num.pop();
					if(c == '*') num.push(num1*num2);
					else num.push(num1+num2);
				}
			}
			
			System.out.printf("#%d %d\n",tc,num.pop());
		}
	}
	// 다른 연산자 넣을꺼면 여기서 우선순위 비교해주면 됨. 
    
	public static boolean check(char op1 , char op2)
	{
	
    	switch (ch) { 
        // 연산자를 만나면 스택 상단의 연산자와 우선순위 비교 
        // 지금 넣으려는 연산자의 우선 순위가 더 크면 해당 연산자를 스택에 삽입 
        // 작거나 같으면 스택 상단의 연산자를 변환 문자열에 추가하고 다시 반복 
        case '+': case '-': case '*': case '/': 
        	while (!st.empty() && now_(ch) <= before_(st.top())) 
            	{ answer += st.top(); st.pop(); } 
                st.push(ch); 
                break; // 왼쪽 괄호가 나오면 스택에 삽입 
        case '(': 
        	st.push(ch); 
            	break; 
                // 오른쪽 괄호가 나오면 스택에서 왼쪽 괄호가 나올때까지 
                // 모든 연산자를 변환 문자열에 추가하고 pop. 왼쪽 괄호는 삭제 
         case ')': 
         	while (!st.empty() && st.top() != '(') 
            	{ answer += st.top(); st.pop(); } 
                st.pop(); //왼쪽 괄호 break; 
                // 피연산자는 바로 변환 문자열에 추가 
         default: answer += ch; 
         	break;
	}
}
