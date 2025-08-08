package Day17_practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button10 extends JFrame {

	public Button10() {
		setTitle("버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Random ran = new Random();
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "번 버튼");
			c.add(btn);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btn.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}
			});
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Button10();
	}
}
