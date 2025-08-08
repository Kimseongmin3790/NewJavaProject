package Day16_20250807;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");

	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			
		});

		c.setLayout(null); // 컴포넌트들의 위치를 따로 지정하지 않음. setLocation으로 지정필요
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}
}