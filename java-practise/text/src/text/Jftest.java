package text;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
/*
 * 建立一个简单的窗体  添加一个按钮控件 绑定控件的监听效果  
 * 设置属性大小  
 * 
 * 
 *
 * 
 * 
 * 
 * 
 * */

public class Jftest extends JFrame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			//JFrame jf=new JFrame();
		Jftest jf=new Jftest();
		JButton btn=new JButton("第一个按钮");
		jf.add(btn);
		jf.setVisible(true);
		//初始化窗口  实例化  可视化
	btn.setBackground(Color.YELLOW);
		
		btn.setVisible(true);
			//绑定监听函数
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//MethodA();
				//这里可以添加你要的事件   绑定了单击函数   点击后启动函数
				a a=new a();
				//弹窗操作   解决弹窗    JOptionPane.showMessageDialog(null,弹窗内容,弹窗标题,JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null,"弹出窗口","弹出",JOptionPane.ERROR_MESSAGE);
				a.aa("你点击了一次按钮");
			}
		});
	//btn.setBounds(30,30,100,100);
	//jf.getWidth();
	}
	//封装了窗体方法  
	
	
	//设置窗体
	public Jftest() {
		// TODO 自动生成的构造函数存根
		
	
		//初始化标题  
		setTitle("第一个窗体");
		//初始化窗体大小  
		setBounds(100, 100, 600, 400);
	
	}
  
	

	
	
		
	
}
//创建一个专门测试的类 以及方法   测试按钮的功能是否实现   
class a{
	public void aa(String str) {
		  System.out.println(str);
	  }
		
}

