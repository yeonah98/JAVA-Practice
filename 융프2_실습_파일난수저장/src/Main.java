import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte data[] = new byte[50];
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("(중복없는)난수 개수 입력> ");
		size = sc.nextInt();
		
		for (int i=0; i<size; i++) {
			data[i] = (byte)(Math.random()*90+10);
			for(int j=0; j<i; j++) {
				if(data[j]==data[i]) {
					i--;
					j=i; //break;
				}
			}
		}
		try {
			FileOutputStream fout = new FileOutputStream("/Users/yuyeon-a/Desktop/연아/Java_Test/test.txt");
			for(int i=0; i<size; i++) {
				fout.write(data[i]);
			}
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류발생! 저장불가!");
			return;
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n파일저장 완료!");
	}

}
