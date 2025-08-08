package Day17_20250808;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {

	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					Random ran = new Random(); // 안에넣으면 가비지 많이생김
					c.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}
			}

		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();
	}

}
