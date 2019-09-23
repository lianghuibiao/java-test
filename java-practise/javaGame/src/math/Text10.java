package math;

import java.awt.Color;
import java.awt.Container;//container 就是一个可以放组件的容器，其本身也是子类。
//JFrame是窗口，包括标题栏最大化最小化按钮等等，而container是其中的组件。
//一般来说JFrame的getContentPane方法都会返回一个代表其中间区域的大的容器，也就是一个container对象，其也是一个JPanel对象
import javax.swing.*;   //这个包可以代替下面这些swing包    自动创建也是可以的
//import javax.swing.JButton;   //调用组健   button
//import javax.swing.JFrame;     //调用swing  jframe窗体  
//import javax.swing.JPanel;     //调用组建 栏框
//import javax.swing.JTabbedPane;   //选项板
public class Text10 extends JFrame{
	
	public static void main(String[] args) {
		
		Text10 main15 = new Text10();
		main15.run();
	}
	
	public void run(){

		//创建组件
		//添加语句
		JButton button1 = new JButton("按钮1");   //创建组件完成才可以调用这个组建的东西
		JButton button2 = new JButton("按钮2");    //添加第二个也是一样
		JButton button3 = new JButton("按钮3");    //添加第二个也是一样
	    button1.setBackground(Color.blue);
		button2.setBounds(20, 20, 80, 30);   //设置第二个的基础属性
		button3.setBounds(40, 40, 80, 30);   //设置第二个的基础属性
		
		//setBounds(int x,int y,int width,int height)
		//(1)前两个是组件左上角在容器中的坐标。  相对于左上角坐标横纵坐标  后面是宽高
		//(2)后两个是宽度和高度。
		//创建面板组件 并设置其布局为null
		JPanel panel = new JPanel(null);  //容器 第二个选项卡
		JPanel panel1 = new JPanel(null);
		panel.add(button3);//添加一个button2  在第二个选项卡中     使用panel.add();的方法进行添加
		panel1.add(button2);
		//创建选项板
		JTabbedPane tabbedPane = new JTabbedPane();   //选项板1  创建一个选项板对象
		tabbedPane.add("选项板一", button1);       //两个页面  这是第一个页面  并且添加一个button对象
		tabbedPane.add("选项板二", panel);         //这是第二个对象    添加一个panel对象
		tabbedPane.add("选项板三", panel1);
		Container container = this.getContentPane();//声名在这个cantainer 中  获取到
		container.add(tabbedPane);   //相当于body容器  在这里面添加选项板   一二 
		/**
		 * 设置窗体属性
		 */
		//设置窗体是否可以改变大小
		//this 声名为当前窗体
		//必须语句
		this.setResizable(false);  //窗体大小不可改变   true 就是能改变
		this.setTitle("选项板");   //设置程序标题
		this.setVisible(true);    //设置程序可见性
		this.setSize(500, 500);   //设置窗体大小
		this.setLocationRelativeTo(null);// 设置居中显示   
		// 设置Jframe窗体关闭时 程序结束
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭程序程序结束  
	}
}
