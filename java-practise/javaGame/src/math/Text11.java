package math;
import javax.swing.JFrame;     //����swing  jframe����  

import java.awt.Container;//container ����һ�����Է�������������䱾��Ҳ�����ࡣ
//JFrame�Ǵ��ڣ����������������С����ť�ȵȣ���container�����е������
//һ����˵JFrame��getContentPane�������᷵��һ���������м�����Ĵ��������Ҳ����һ��container������Ҳ��һ��JPanel����
 //�������Լ�������   ������û��  ��Ȼ�����Լ�ȥ������ʵİ�
import javax.swing.*;   //��������Դ���������Щswing��    �Զ�����Ҳ�ǿ��Ե�
//import javax.swing.JButton;
//import javax.swing.JPanel;     //�����齨 ����
//import javax.swing.JTabbedPane;
public class Text11 extends JFrame {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
   Text11 box=new Text11();  //ʵ�廯�����   ��������ķ���  �ö���.���������ķ�ʽ
    box.test();   //��������ķ���  
	}
   //���Դ���һ���µķ������д���
	public void test() {
		JButton button1=new JButton("button1");  //�����������ӿؼ�������
		button1.setBounds(20, 20, 80, 30);    //�����ÿؼ���λ�ô�С  
		//setBounds(int x,int y,int width ,int height)   ��������Ͻǵ�����   �������������ָ�ÿؼ��Ŀ��
		
		//jpanel ҲҪʵ�廯����
		JPanel jPanel=new JPanel(null);
		jPanel.add(button1);
		//Ϊʲô�����ڻ��ǲ��У�  ����Ϊû�����ô���Ĵ�С�Լ��ɼ�
		//ʹ�÷���   this���Ի�ȡ��ǰ�Ķ���   
		this.setResizable(false);  //�����С���ɸı�   true �����ܸı�
		this.setTitle("ѡ���");   //���ó������
		this.setVisible(true);    //���ó���ɼ���
		this.setSize(500, 500);   //���ô����С
		this.setLocationRelativeTo(null);// ���þ�����ʾ   
		// ����Jframe����ر�ʱ �������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رճ���������  
		//Ϊʲô��������˵��ǰ�ťȴû�г����أ�
		JTabbedPane tabbedPane = new JTabbedPane();   //ѡ���1  ����һ��ѡ������
		tabbedPane.add("ѡ���һ", jPanel); 
		//���������ز�����  ��Ϊ�����һ������  �����һЩ��
		Container container = this.getContentPane();//���������cantainer ��  ��ȡ��   
		container.add(tabbedPane);   //�൱��body����  �����������ѡ���   һ�� 
		
		//����һ���򵥵Ĵ�����ӿؼ��������
	}
}
