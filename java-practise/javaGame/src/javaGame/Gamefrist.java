package javaGame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

//����Ľ���   �����Դ������С�� �رհ�ť
	import java.awt.Color;
import java.awt.Container;
	public class Gamefrist{
		
	    public static void main(String[] args){
	        JFrame f=new JFrame("�ɻ���ս");    //����������󲢸��������
	        f.setSize(600,600);    //���ô����С
	        f.setBackground(Color.red);    //���ñ�����ɫ
	        f.setLocation(300,200);    //���ô�����ʾλ��
	        f.setVisible(true);    //��ʾ����
	     /* final JLabel tabLabelA=new JLabel();
	      tabLabelA.setText("��Ŀ1");
	       tabLabelA.setVisible(true);
	       tabLabelA.setSize(100,100);*/
	        //���ر���ͼƬ
	        //���lable�ؼ�
	        Container vContainer=f.getContentPane();
	        JLabel f1=new JLabel("���ǵ�һ������");
	        f1.setHorizontalAlignment(SwingConstants.CENTER);
	       // f1.setSize(200,200);
	        vContainer.add(f1);
	        vContainer.setBackground(Color.red);
	       //�ܽ�   �Ƚ���һ���ؼ�����
	        //1.�ÿؼ����ھ���λ��
	        //2.���������������ؼ�    ��ȡ������������ӿؼ�
	        
	        
	        
	        
	        
	       
	        
	      
	    }
	            //ע�����ɵĴ���رհ�ť����ʹ�����˳�����Ҫʹ��ctrl+c��ϼ����˳�

}
