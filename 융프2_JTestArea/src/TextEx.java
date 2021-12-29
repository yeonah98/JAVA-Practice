import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextEx extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	
	TextEx() {
		setTitle("텍스트 입력 실습");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요."));
		c.add(tf);
		c.add(ta);
		
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
			
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEx();
	}

}
