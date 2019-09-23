package text;
import java.util.*;

//键盘以及鼠标监听
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//char a=A;
		//练习1   输出A-Z  按照字符编码 65-90 利用循环可以得到24个字母  
		/*for (int i =65; i <= 90; i++) {
			
			System.out.println((char)i);
		}*/
		/*char 类型用来解读 字符编码 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		//创建输入对象   允许输入
		Scanner sc=new Scanner(System.in);
		//获取输入字符
		String[] num = {"A","B"};
		
		//创建一个变量去接受这个结果
		
	//string 类型无法转化成char类型  
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		
		}
	
	}
	
	
	/*
	//键盘监听接口的API
	void keyPressed(KeyEvent e); //按下键时调用。
	void keyReleased(KeyEvent e); //当键已被释放时调用。
	void keyTyped(KeyEvent e); //键入键时调用。
	//鼠标监听接口的API
	void mouseClicked(MouseEvent e); //在组件上单击（按下并释放）鼠标按钮时调用。
	void mouseEntered(MouseEvent e); //当鼠标进入组件时调用。
	void mouseExited(MouseEvent e); //当鼠标退出组件时调用。
	void mousePressed(MouseEvent e); //在组件上按下鼠标按钮时调用。
	void mouseReleased(MouseEvent e); //在组件上释放鼠标按钮时调用。
*/

}



