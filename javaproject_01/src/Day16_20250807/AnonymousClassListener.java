package Day16_20250807;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		JButton color = new JButton("배경색 변경");
		c.add(btn);
		c.add(color);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton eventBtn = (JButton)e.getSource();
				if(eventBtn.getText().equals("Action")) {
					eventBtn.setText("액션");
				} else {
					eventBtn.setText("Action");
				}
			}
			
		});
		Random ran = new Random();
		color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
