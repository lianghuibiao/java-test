package practise;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



@SuppressWarnings("serial")
public class PractiseFrist extends JFrame {
	
	
	//���ô��ڴ�С
	public void setSize(int width, int height) {
		// TODO �Զ����ɵķ������
		super.setSize(width, height);
	}
	
	@Override
	//���ô����Ƿ�ɼ�
	public void setVisible(boolean b) {
		// TODO �Զ����ɵķ������
		super.setVisible(b);
	}
	
	@Override
	public void setBackground(Color bgColor) {
		// TODO �Զ����ɵķ������
		super.setBackground(bgColor);
	}
	public PractiseFrist() {
		//��������   �����������Ӱ�ť
		 setLayout(new GridLayout(7,3,5,5));
		    for(int i=0;i<=10;i++) {
		    	add(new JButton("��ť"+i));
		    }
		    setSize(50,55);
		    setVisible(true);
		    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		    
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			/*
			 * ��������Ӧ�ó���
			 * ���ӿؼ� 
			 * ���ذ�
			 * ���ؼ����ӹ���
			 * ʵ��������Ҫд��main��������
			 * 
			 * 
			 * 
			 * 
			 * */
		
		
		PractiseFrist pr=new PractiseFrist();
		Container con=pr.getContentPane();
		JButton btn=new JButton("�����ҵİ�ť");
		JLabel label=new JLabel("���Ǳ���");
		pr.setSize(500,500);
		pr.setVisible(true);
		pr.setBackground(Color.red);
		pr.setTitle("���񴰿�");
		//ֱ�����ӱ���Ļ���Ƚ����
		//��ťҪ���ô�С����ʵ�廯�ɹ� 
		btn.setSize(100, 100);
		btn.setBackground(Color.red);
	   con.add(btn);
	    con.add(label);
	label.setBackground(Color.red);
	    
	    //Ϊ��ť���ӵ����¼�    
	    /*
	     * 
	     *  btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				//����д��ť�Ĺ���   
			}
		});
	     * 
	     * 
	     * */
	    btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
			//	JOptionPane.showMessageDialog(null, "����");�����¼� Ҫ��������﷨����������
				JOptionPane.showMessageDialog(null, "����");
			}
		});
	    
	}
   
	
	

}
class frame{
	
}