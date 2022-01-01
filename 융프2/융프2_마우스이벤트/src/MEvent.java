import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MEvent extends JFrame {
	
	JLabel la = new JLabel("hello"); //Field
	
	MEvent() {
		setTitle("Mouse Event 실습");
		
		//초기화면
		Container c = getContentPane();
		c.setLayout(null);
		//Listen 등록 (ContentPane에 등록)
		c.addMouseListener(new MyMouseAda());
		//초기값 설정
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	
	// Adapter 클래스 
	class MyMouseAda extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			
			Point p = e.getPoint();
			la.setLocation(p);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			super.mouseEntered(e);
			
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		
	}
	
	
	/*
	//내부클래스 
	class MyMouseLi implements MouseListener{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
			Point p = e.getPoint();
			la.setLocation(p);
		}
	
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MEvent();
	}

}
