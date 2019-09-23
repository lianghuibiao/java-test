package book;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Book5 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Book5 frame = new Book5();
		frame.setVisible(true);
	}
	
	public Book5() {
		super();
		setTitle("ʹ�ù�����");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JToolBar toolBar = new JToolBar("������");// ��������������
		toolBar.setFloatable(false);// ����Ϊ�������϶�
		getContentPane().add(toolBar, BorderLayout.NORTH);// ��ӵ����񲼾ֵ��Ϸ�
		final JButton newButton = new JButton("�½�");// ������ť����
		newButton.addActionListener(new ButtonListener());// ��Ӷ����¼�������
		toolBar.add(newButton);// ��ӵ���������
		toolBar.addSeparator();// ���Ĭ�ϴ�С�ķָ���
		final JButton saveButton = new JButton("����");// ������ť����
		saveButton.addActionListener(new ButtonListener());// ��Ӷ����¼�������
		toolBar.add(saveButton);// ��ӵ���������
		toolBar.addSeparator(new Dimension(20, 0));// ���ָ����С�ķָ���
		final JButton exitButton = new JButton("�˳�");// ������ť����
		exitButton.addActionListener(new ButtonListener());// ��Ӷ����¼�������
		toolBar.add(exitButton);// ��ӵ���������
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			System.out.println("���������ǣ�" + button.getText());
		}
	}
	
}
//����̨�����Ĳ���ָ��