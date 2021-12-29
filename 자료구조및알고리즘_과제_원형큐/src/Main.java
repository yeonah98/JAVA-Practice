
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue q = new MyQueue();
		
		//원형 큐의 크기 5로 지정
		q.newQueue(5);
		
		//1부터 6까지 숫자를 큐에 넣기
		q.add('1');
		q.add('2');
		q.add('3');
		q.add('4');
		
		//큐가 꽉 차서 에러메세지 출력 
		q.add('5');
		q.add('6');
		
		//0을 입력 시 데이터를 하나씩 삭제
		q.add('0');
		q.add('0');
		q.add('0');
		q.add('0');
		
		//삭제할 데이터가 없을 경우 에러메세지 출력
		q.add('0');
	}

}
