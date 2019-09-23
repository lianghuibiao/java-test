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
		setTitle("使用工具栏");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JToolBar toolBar = new JToolBar("工具栏");// 创建工具栏对象
		toolBar.setFloatable(false);// 设置为不允许拖动
		getContentPane().add(toolBar, BorderLayout.NORTH);// 添加到网格布局的上方
		final JButton newButton = new JButton("新建");// 创建按钮对象
		newButton.addActionListener(new ButtonListener());// 添加动作事件监听器
		toolBar.add(newButton);// 添加到工具栏中
		toolBar.addSeparator();// 添加默认大小的分隔符
		final JButton saveButton = new JButton("保存");// 创建按钮对象
		saveButton.addActionListener(new ButtonListener());// 添加动作事件监听器
		toolBar.add(saveButton);// 添加到工具栏中
		toolBar.addSeparator(new Dimension(20, 0));// 添加指定大小的分隔符
		final JButton exitButton = new JButton("退出");// 创建按钮对象
		exitButton.addActionListener(new ButtonListener());// 添加动作事件监听器
		toolBar.add(exitButton);// 添加到工具栏中
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			System.out.println("您单击的是：" + button.getText());
		}
	}
	
}
//控制台输出你的操作指令