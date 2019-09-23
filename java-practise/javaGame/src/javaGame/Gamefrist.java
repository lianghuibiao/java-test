package javaGame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

//窗体的建立   窗体自带最大化最小化 关闭按钮
	import java.awt.Color;
import java.awt.Container;
	public class Gamefrist{
		
	    public static void main(String[] args){
	        JFrame f=new JFrame("飞机大战");    //创建窗体对象并赋标题参数
	        f.setSize(600,600);    //设置窗体大小
	        f.setBackground(Color.red);    //设置背景颜色
	        f.setLocation(300,200);    //设置窗体显示位置
	        f.setVisible(true);    //显示窗体
	     /* final JLabel tabLabelA=new JLabel();
	      tabLabelA.setText("项目1");
	       tabLabelA.setVisible(true);
	       tabLabelA.setSize(100,100);*/
	        //加载背景图片
	        //添加lable控件
	        Container vContainer=f.getContentPane();
	        JLabel f1=new JLabel("这是第一个窗体");
	        f1.setHorizontalAlignment(SwingConstants.CENTER);
	       // f1.setSize(200,200);
	        vContainer.add(f1);
	        vContainer.setBackground(Color.red);
	       //总结   先建立一个控件对象
	        //1.该控件处于居中位置
	        //2.在容器中添加这个控件    获取到的容器中添加控件
	        
	        
	        
	        
	        
	       
	        
	      
	    }
	            //注意生成的窗体关闭按钮不能使程序退出，需要使用ctrl+c组合件来退出

}
