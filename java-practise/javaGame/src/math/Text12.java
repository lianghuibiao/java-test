package math;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;


public class Text12 extends JFrame {
   
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    Text12 fun =new Text12();
    fun.run();
	}
   public void run() {
	   JButton button =new JButton("button");
	   button.setBounds(20, 20, 100, 100);
	   button.setBackground(Color.red);
	   button.setVisible(true);//ʵ�廯button
	  
	   this.setTitle("����");
	   this.setVisible(true);
	   this.setSize(500, 500);
	   //���һ������
	   JPanel panel=new JPanel(null);//ʵ�廯
	   panel.add("aa",button);//���button�ؼ�
	   
	   
	   //ѡ�������
	   JTabbedPane tabbedPane = new JTabbedPane();   //ѡ���1  ����һ��ѡ������
		tabbedPane.add("ѡ���һ",panel); 
		Container container = this.getContentPane();//���������cantainer ��  ��ȡ��   
		container.add(tabbedPane);   //�൱��body����  �����������ѡ���   һ�� 
   }
   //���ÿɼ���

}
