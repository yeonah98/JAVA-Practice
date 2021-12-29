import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("실습문제 그래픽");
		
		//MyPanel m_panel = new MyPanel();
		setContentPane(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public class MyPanel extends JPanel {
		private int cnt = 0;
		private int[] x = new int[100];
		private int[] y = new int[100];
	
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					x[cnt] = e.getX();
					y[cnt++] = e.getY();
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					x[cnt] = e.getX();
					y[cnt++] = e.getY();
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
				g.setColor(new Color(180,50,255));
				g.drawPolygon(x,y,cnt);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();

	}

}
