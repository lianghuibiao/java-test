package math;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;


public class Text12 extends JFrame {
   
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    Text12 fun =new Text12();
    fun.run();
	}
   public void run() {
	   JButton button =new JButton("button");
	   button.setBounds(20, 20, 100, 100);
	   button.setBackground(Color.red);
	   button.setVisible(true);//实体化button
	  
	   this.setTitle("窗体");
	   this.setVisible(true);
	   this.setSize(500, 500);
	   //添加一个容器
	   JPanel panel=new JPanel(null);//实体化
	   panel.add("aa",button);//添加button控件
	   
	   
	   //选项版容器
	   JTabbedPane tabbedPane = new JTabbedPane();   //选项板1  创建一个选项板对象
		tabbedPane.add("选项板一",panel); 
		Container container = this.getContentPane();//声名在这个cantainer 中  获取到   
		container.add(tabbedPane);   //相当于body容器  在这里面添加选项板   一二 
   }
   //设置可见性

}
