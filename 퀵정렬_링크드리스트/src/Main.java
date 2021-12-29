import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<Integer> list = new LinkedList<Integer>(); //링크드 리스트 생성합니다.
	Scanner sc = new Scanner(System.in);
	
	//사용자에게 10개의 입력값을 받아 링크드 리스트에 삽입합니다.
	for (int i = 0; i < 10; i++) {
		int n = sc.nextInt(); 
		if(n <= 0 || n >= 100) {
			System.out.println("다시 입력 하세요"); //주어진 범위를 벗어난 입력값을 받으면 종료합니다.
			return ;
		}
		list.add(n);
		}
		quickSort(list); //퀵정렬 함수에 리스트를 보냅니다.
	}
	
	
	public static List<Integer> quickSort(List<Integer> list) {
		//재귀함수를 끝내는 조건 (리스트에 한개의 원소만 남아있는경우 그 원소를 반환)
		if(list.size() < 2)
	            return list;
	
	        
	        int pivot = list.get(0); //기준이 되는 피벗값을 설정해준다. (제일 왼쪽에 있는 원소를 피벗으로 설정했습니다)
	        List<Integer> L = new ArrayList<>(); //기준보다 작은 원소를 보낼 링크드리스트 L을 생성합니다.
	        List<Integer> R = new ArrayList<>(); //기준보다 큰 원소를 보낼 링크드리스트 R을 생성합니다.
	        
	        //리스트에 들어있는 모든 원소를 피벗을 기준으로 작으면 L 크면 R에 추가합니다.
	        for(int i=1; i<list.size(); i++) {
	           if(list.get(i) < pivot) {
	               L.add(list.get(i));
	           }else {
	               R.add(list.get(i));
	           }
	       }
	        
	      //정렬이 완료된 최종 리스트인 sorted를 생성함과 동시에 기준보다 작은 L리스트를 다시 퀵정렬합니다.
	      //L리스트가 계속 재귀함수로 돌다가 25번 줄의 조건인 리스트가 1개로 남았을 경우부터 반환합니다. 그러면 기준보다 작은 값부터 sorted에 삽입됩니다.
	       List<Integer> sorted = quickSort(L); 
	       
	      //기준보다 작은 값이 sorted에 다 들어간 후 기준값을 넣어줍니다.
	       sorted.add(pivot);
	       
	      //마지막으로 기준값보다 큰 R리스트도 동일하게 퀵정렬로 재귀함수를 돌린 후 차례대로 sorted에 들어가게 됩니다.
	       sorted.addAll(quickSort(R));
	       
	      //최종적으로 sorted에 원소가 10개가 되는 순간 정렬이 완료된 것으로 간주하여 sorted를 출력해줍니다.
	       if(sorted.size() == 10) {
	    	   System.out.println(sorted);
	       }
	       
	        return sorted;
	}
}
