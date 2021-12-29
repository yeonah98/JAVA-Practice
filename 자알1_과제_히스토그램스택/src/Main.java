
public class Main {
	
	public static int[] histogram = {3, 2, 3, 4, 2, 3, 4, 1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len = histogram.length;
		
		long answer = getArea(len);
		
		System.out.println(answer);
	}

	
	public static long getArea(int len) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		long maxArea = 0;
		
		for(int i = 0; i < len; i++) {
			
		
			while((!stack.isEmpty()) && histogram[stack.peek()] >= histogram[i]) {
				int height = histogram[stack.pop()];
				
				long width = stack.isEmpty() ? i : i - 1 - stack.peek(); 
				
				maxArea = Math.max(maxArea, height * width);	
			}
			
		
			stack.push(i);
 
		}
		
        while(!stack.isEmpty()) {
            int height = histogram[stack.pop()];
            
            long width = stack.isEmpty() ? len: len - 1 - stack.peek();
            maxArea = Math.max(maxArea, width * height);
        }
		
        return maxArea;
	}
		
}