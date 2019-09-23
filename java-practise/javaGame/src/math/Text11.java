package math;
import javax.swing.JFrame;     //调用swing  jframe窗体  

import java.awt.Container;//container 就是一个可以放组件的容器，其本身也是子类。
//JFrame是窗口，包括标题栏最大化最小化按钮等等，而container是其中的组件。
//一般来说JFrame的getContentPane方法都会返回一个代表其中间区域的大的容器，也就是一个container对象，其也是一个JPanel对象
 //包都是自己创建的   除非是没有  不然都会自己去导入合适的包
import javax.swing.*;   //这个包可以代替下面这些swing包    自动创建也是可以的
//import javax.swing.JButton;
//import javax.swing.JPanel;     //调用组建 栏框
//import javax.swing.JTabbedPane;
public class Text11 extends JFrame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   Text11 box=new Text11();  //实体化类对象   调用下面的方法  用对象.方法（）的方式
    box.test();   //调用下面的方法  
	}
   //可以创建一个新的方法进行创建
	public void test() {
		JButton button1=new JButton("button1");  //括号里可以添加控件的名称
		button1.setBounds(20, 20, 80, 30);    //创建该控件的位置大小  
		//setBounds(int x,int y,int width ,int height)   相对于左上角的坐标   最后两个参数是指该控件的宽高
		
		//jpanel 也要实体化对象
		JPanel jPanel=new JPanel(null);
		jPanel.add(button1);
		//为什么到现在还是不行？  是因为没有设置窗体的大小以及可见
		//使用方法   this可以获取当前的东西   
		this.setResizable(false);  //窗体大小不可改变   true 就是能改变
		this.setTitle("选项板");   //设置程序标题
		this.setVisible(true);    //设置程序可见性
		this.setSize(500, 500);   //设置窗体大小
		this.setLocationRelativeTo(null);// 设置居中显示   
		// 设置Jframe窗体关闭时 程序结束
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭程序程序结束  
		//为什么窗体出来了但是按钮却没有出来呢？
		JTabbedPane tabbedPane = new JTabbedPane();   //选项板1  创建一个选项板对象
		tabbedPane.add("选项板一", jPanel); 
		//下面两个必不可少  因为是添加一个容器  可添加一些包
		Container container = this.getContentPane();//声名在这个cantainer 中  获取到   
		container.add(tabbedPane);   //相当于body容器  在这里面添加选项板   一二 
		
		//这样一个简单的窗体添加控件就完成了
	}
}
