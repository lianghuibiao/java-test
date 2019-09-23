package book;

import static javax.swing.SpringLayout.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Book4 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Book4 frame = new Book4();
		frame.setVisible(true);
	}
	
	public Book4() {
		super();
		setTitle("ʹ�õ��ɺ�֧��");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		Spring vST = Spring.constant(20);// ����һ��֧��
		Spring hSP = Spring.constant(20, 100, 500);// ����һ������
		
		JButton lButton = new JButton("��ťL");
		getContentPane().add(lButton);
		springLayout.putConstraint(NORTH, lButton, vST, NORTH,
				getContentPane());// ����ťL�����ࡪ��>��������
		springLayout.putConstraint(WEST, lButton, hSP, WEST,
				getContentPane());// ����ťL�����ࡪ��>��������
		
		JButton rButton = new JButton("��ťR");
		getContentPane().add(rButton);
		// ����ťR�����ࡪ��>����ťR������
		springLayout.putConstraint(NORTH, rButton, 0, NORTH, lButton);
		springLayout.putConstraint(WEST, rButton, Spring.scale(hSP, 2),
				EAST, lButton);// ����ťR�����ࡪ��>����ťL������
		// �������ࡪ��>����ťR������
		springLayout.putConstraint(EAST, getContentPane(), hSP, EAST,
				rButton);
		//lButton.action(evt, what)
	}
	
}

