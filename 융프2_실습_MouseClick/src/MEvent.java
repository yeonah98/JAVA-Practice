import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MEvent extends JFrame {
	
	JLabel la = new JLabel("C"); //Field
	
	MEvent() {
		setTitle("Mouse Click Random Position");
		
		//초기화면
		Container c = getContentPane();
		c.setLayout(null);
		//초기값 설정
		la.setSize(50,20);
		la.setLocation(30,30);
		la.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				int x = (int)(Math.random()*350);
				int y = (int)(Math.random()*280);
				la.setLocation(x,y);
			}
			
		});
		c.add(la);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	
	// Adapter 클래스 
//	class MyMouseAda extends MouseAdapter {
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			super.mousePressed(e);
//			int x = (int)(Math.random()*350);
//			int y = (int)(Math.random()*280);
//			la.setLocation(x,y);
//		}
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MEvent();
	}

}
