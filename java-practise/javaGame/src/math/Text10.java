package math;

import java.awt.Color;
import java.awt.Container;//container ����һ�����Է�������������䱾��Ҳ�����ࡣ
//JFrame�Ǵ��ڣ����������������С����ť�ȵȣ���container�����е������
//һ����˵JFrame��getContentPane�������᷵��һ���������м�����Ĵ��������Ҳ����һ��container������Ҳ��һ��JPanel����
import javax.swing.*;   //��������Դ���������Щswing��    �Զ�����Ҳ�ǿ��Ե�
//import javax.swing.JButton;   //�����齡   button
//import javax.swing.JFrame;     //����swing  jframe����  
//import javax.swing.JPanel;     //�����齨 ����
//import javax.swing.JTabbedPane;   //ѡ���
public class Text10 extends JFrame{
	
	public static void main(String[] args) {
		
		Text10 main15 = new Text10();
		main15.run();
	}
	
	public void run(){

		//�������
		//������
		JButton button1 = new JButton("��ť1");   //���������ɲſ��Ե�������齨�Ķ���
		JButton button2 = new JButton("��ť2");    //��ӵڶ���Ҳ��һ��
		JButton button3 = new JButton("��ť3");    //��ӵڶ���Ҳ��һ��
	    button1.setBackground(Color.blue);
		button2.setBounds(20, 20, 80, 30);   //���õڶ����Ļ�������
		button3.setBounds(40, 40, 80, 30);   //���õڶ����Ļ�������
		
		//setBounds(int x,int y,int width,int height)
		//(1)ǰ������������Ͻ��������е����ꡣ  ��������Ͻ������������  �����ǿ��
		//(2)�������ǿ�Ⱥ͸߶ȡ�
		//���������� �������䲼��Ϊnull
		JPanel panel = new JPanel(null);  //���� �ڶ���ѡ�
		JPanel panel1 = new JPanel(null);
		panel.add(button3);//���һ��button2  �ڵڶ���ѡ���     ʹ��panel.add();�ķ����������
		panel1.add(button2);
		//����ѡ���
		JTabbedPane tabbedPane = new JTabbedPane();   //ѡ���1  ����һ��ѡ������
		tabbedPane.add("ѡ���һ", button1);       //����ҳ��  ���ǵ�һ��ҳ��  �������һ��button����
		tabbedPane.add("ѡ����", panel);         //���ǵڶ�������    ���һ��panel����
		tabbedPane.add("ѡ�����", panel1);
		Container container = this.getContentPane();//���������cantainer ��  ��ȡ��
		container.add(tabbedPane);   //�൱��body����  �����������ѡ���   һ�� 
		/**
		 * ���ô�������
		 */
		//���ô����Ƿ���Ըı��С
		//this ����Ϊ��ǰ����
		//�������
		this.setResizable(false);  //�����С���ɸı�   true �����ܸı�
		this.setTitle("ѡ���");   //���ó������
		this.setVisible(true);    //���ó���ɼ���
		this.setSize(500, 500);   //���ô����С
		this.setLocationRelativeTo(null);// ���þ�����ʾ   
		// ����Jframe����ر�ʱ �������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رճ���������  
	}
}
