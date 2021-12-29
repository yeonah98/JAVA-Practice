import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("컬러영상뷰어");
		setContentPane(new MyPanel());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			int data[] = new int[600*2000];
			int H, W;
			int n=0, tmp;
			
			H=512;
			W=512;
			
			int colorW = W*3;
			
			try {
				FileInputStream fin = new FileInputStream("/Users/yuyeon-a/Desktop/연아/학교 4-2/융합프로그래밍2/실험영상 업로드/컬러영상/barbara.raw");
				while ( (tmp=fin.read()) != -1 ) {
					data[n++] = tmp;
				}
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 읽기 불가!");
				return;
			}
			
			int R[][] = new int[600][600];
			int G[][] = new int[600][600];
			int B[][] = new int[600][600];
			for (int i=0; i<H; i++) {
				for(int j=0; j<colorW; j++) {
					switch(j%3) {
					case 0:
						R[i][j/3] = data[i*colorW+j];
						break;
					case 1:
						G[i][j/3] = data[i*colorW+j];
						break;
					case 2:
						B[i][j/3] = data[i*colorW+j];
						break;
					}
				}
			}
			
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					g.setColor( new Color(R[i][j],G[i][j],B[i][j]) );
					g.drawRect(20+j, 20+i, 1, 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
