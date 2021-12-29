
public class MyQueue {
	private int front; // 출력 포인터
    private int rear; // 삽입 포인터
    private int Qsize; // 전체 큐의 사이즈
    private char[] QArray; // Qsize를 이용하여 전체 배열 생성
 
    public void newQueue(int Qsize) { // 큐를 생성하는 메소드
        front = 0; //
        rear = 0; // 맨처음 출력,삽입 포인터가 큐의 0번지를 가리키고 있다.
        this.Qsize = Qsize;
        QArray = new char[Qsize];
        System.out.println("크기는 : " + Qsize);
    }
 
    public boolean isFull() { // 큐가 포화 상태인지 검사하는 메소드
        if (((rear + 1) % this.Qsize) == front) { // 원형큐의 핵심 코드, 아래에서 그림과 함께 설명.
            return true;
        } else {
            return false;
        }
    }
 
    public boolean isEmpty() { // 큐가 이어있는지 검사하는 메소드.
        return rear == front; // rear와 front는 데이터가 삽입되기 전에만 같은 위치를 가리키기 때문에 큐가 비어있는 상태검사에 사용.
    }
 
    public boolean add(Object ob) {
    	if ((char)ob == '0') { // 큐에 0이 들어온다면 데이터 삭
       	 if (isEmpty()) {
                System.out.println("큐가 비어있습니다.");
                return false;
            } else {
                front = (++front) % this.Qsize;
                System.out.println(QArray[(front) % Qsize] + "를 삭제");
                return true;
            }
       }
        if (isFull()) { // 큐가 가득차 있지 않다면 삽입.
            System.out.println("큐가 꽉 차 있습니다.");
            return false;
        } 
        else {
            rear = (++rear) % this.Qsize; // 아래 그림에서 설명
            QArray[rear] = (char) ob; // 삽입포인터 rear가 가리키는 공간에 데이터 삽입.
            System.out.println(ob + "를 " + rear + "번째에" + " 삽입");
            return true;
        }
    }
 
    public Object remove() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        } else {
            front = (++front) % this.Qsize;
            System.out.println(QArray[(front) % Qsize] + "를 삭제");
            return QArray[front];
        }
    }
 
    public Object peek() {
        System.out.println(QArray[(front + 1) % this.Qsize]);
        return QArray[(front + 1) % this.Qsize];
    }
}
