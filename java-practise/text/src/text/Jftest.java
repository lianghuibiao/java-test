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
 * ����һ���򵥵Ĵ���  ���һ����ť�ؼ� �󶨿ؼ��ļ���Ч��  
 * �������Դ�С  
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
		// TODO �Զ����ɵķ������
			//JFrame jf=new JFrame();
		Jftest jf=new Jftest();
		JButton btn=new JButton("��һ����ť");
		jf.add(btn);
		jf.setVisible(true);
		//��ʼ������  ʵ����  ���ӻ�
	btn.setBackground(Color.YELLOW);
		
		btn.setVisible(true);
			//�󶨼�������
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//MethodA();
				//������������Ҫ���¼�   ���˵�������   �������������
				a a=new a();
				//��������   �������    JOptionPane.showMessageDialog(null,��������,��������,JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null,"��������","����",JOptionPane.ERROR_MESSAGE);
				a.aa("������һ�ΰ�ť");
			}
		});
	//btn.setBounds(30,30,100,100);
	//jf.getWidth();
	}
	//��װ�˴��巽��  
	
	
	//���ô���
	public Jftest() {
		// TODO �Զ����ɵĹ��캯�����
		
	
		//��ʼ������  
		setTitle("��һ������");
		//��ʼ�������С  
		setBounds(100, 100, 600, 400);
	
	}
  
	

	
	
		
	
}
//����һ��ר�Ų��Ե��� �Լ�����   ���԰�ť�Ĺ����Ƿ�ʵ��   
class a{
	public void aa(String str) {
		  System.out.println(str);
	  }
		
}

