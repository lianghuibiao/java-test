package practise;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



@SuppressWarnings("serial")
public class PractiseFrist extends JFrame {
	
	
	//设置窗口大小
	public void setSize(int width, int height) {
		// TODO 自动生成的方法存根
		super.setSize(width, height);
	}
	
	@Override
	//设置窗口是否可见
	public void setVisible(boolean b) {
		// TODO 自动生成的方法存根
		super.setVisible(b);
	}
	
	@Override
	public void setBackground(Color bgColor) {
		// TODO 自动生成的方法存根
		super.setBackground(bgColor);
	}
	public PractiseFrist() {
		//添加网格   在网格中添加按钮
		 setLayout(new GridLayout(7,3,5,5));
		    for(int i=0;i<=10;i++) {
		    	add(new JButton("按钮"+i));
		    }
		    setSize(50,55);
		    setVisible(true);
		    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		    
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			/*
			 * 创建窗体应用程序
			 * 添加控件 
			 * 加载包
			 * 给控件添加功能
			 * 实例化窗口要写在main方法里面
			 * 
			 * 
			 * 
			 * 
			 * */
		
		
		PractiseFrist pr=new PractiseFrist();
		Container con=pr.getContentPane();
		JButton btn=new JButton("这是我的按钮");
		JLabel label=new JLabel("这是表格");
		pr.setSize(500,500);
		pr.setVisible(true);
		pr.setBackground(Color.red);
		pr.setTitle("网格窗口");
		//直接添加标题的话会比较舒服
		//按钮要设置大小才能实体化成功 
		btn.setSize(100, 100);
		btn.setBackground(Color.red);
	   con.add(btn);
	    con.add(label);
	label.setBackground(Color.red);
	    
	    //为按钮添加弹窗事件    
	    /*
	     * 
	     *  btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				//这里写按钮的功能   
			}
		});
	     * 
	     * 
	     * */
	    btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
			//	JOptionPane.showMessageDialog(null, "弹窗");弹窗事件 要用特殊的语法做到弹窗；
				JOptionPane.showMessageDialog(null, "弹窗");
			}
		});
	    
	}
   
	
	

}
class frame{
	
}
