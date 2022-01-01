import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte data[] = new byte[50];
		int n=0, tmp;
		
		try {
			FileInputStream fin = new FileInputStream("/Users/yuyeon-a/Desktop/연아/Java_Test/test.txt");
			while( (tmp=fin.read()) != -1 ) {
				data[n++]=(byte)tmp;
			}
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류발생! 파일읽기 불가!");
			return;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n파일읽기 완료!");
	}

}
