import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextMouseListener extends JFrame {
	private JLabel la = new JLabel("Han");
	private JTextField tf = new JTextField();
	
	public TextMouseListener() {
		setTitle("실습과제 Event응용");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel guide = new JLabel("입력후 <Enter> ");
		guide.setSize(100,20);
		guide.setLocation(20,20);
		c.add(guide);
		
		la.setSize(50,20);
		la.setLocation(30,70);
		c.add(la);
		
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				la.setLocation(e.getX(),e.getY());
			}
		});
		
		tf.setSize(100,20);
		tf.setLocation(120,20);
		c.add(tf);
		
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				la.setText(tf.getText());
				tf.setText("");
			}
		});
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextMouseListener();
	}

}
