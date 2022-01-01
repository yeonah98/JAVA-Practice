import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
			Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
	
	
	MyFrame() {
		setTitle("10 Colors Button");
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout());
		
		JButton[] xylo = new JButton[10];
		String num;
		
		for(int i=0; i<10; i++) {
			num =Integer.toString(i);
			xylo[i] = new JButton(num);
			xylo[i].setBackground(color[i]);
			xylo[i].setOpaque(true);
			xylo[i].setBorderPainted(false);
			cp.add(xylo[i]);
		}
		
		for(int i=0; i<10; i++) {
			xylo[i].addActionListener(new MyActionListener());
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}

class MyActionListener implements ActionListener {

	Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
			Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		String num;
		
		if (b.getBackground().equals(Color.WHITE)) {
			for(int i=0; i<10; i++) {
				num = Integer.toString(i);
				if(b.getText().equals(num))
					b.setBackground(color[i]);
			}
		}
		else {
			b.setBackground(Color.WHITE);
			b.setOpaque(true);
			b.setBorderPainted(false);
		}
		
		
	}
}
