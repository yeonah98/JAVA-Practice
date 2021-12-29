import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		setTitle("배치관리자 실습");
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton bt = new JButton("Action");

		bt.setBackground(Color.YELLOW);
		bt.setOpaque(true);
		bt.setBorderPainted(false);
		
		//버튼 등록
		bt.addActionListener(new ActionListener() { //익명 클래

			public void actionPerformed(ActionEvent e) { //이벤트 객체 
				//해야할 일
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				}
			
			} );
		c.add(bt);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		}
		/*
		//내부클래스
		class MyActionLi implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) { //이벤트 객체 
			//해야할 일
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			}
		
		}
		*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}

//
////독립클래스로 Listener
//class MyActionLi implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) { //이벤트 객체 
//		//해야할 일
//		JButton b = (JButton)e.getSource();
//		if(b.getText().equals("Action"))
//			b.setText("액션");
//		else
//			b.setText("Action");
//	}
//	
//}
