package practise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PractiseFifth extends JFrame {
	

	Image image=Toolkit.getDefaultToolkit().getImage("img/btn.png");
	
	
	//���ô���
	void frame() {
		//���ÿɼ�
		setVisible(true);
		//���ô�С
		setSize(300, 400);
		//���ñ�����ɫ
		setBackground(Color.red);
		//�����Լ�������Ͻǿ�ʼ��λ��
		setLocation(200,200);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ʵ��������
		PractiseFifth jf=new PractiseFifth();
		Container con=jf.getContentPane();
		//����ؼ���û�а취������ɫ��
		JLabel jl=new JLabel("hello");
		//ʵ����һ����ť
		JButton btn=new JButton("��ť");
		jl.setSize(100, 100);
		jl.setBackground(Color.blue);
		btn.setSize(100,50);
		BorderLayout bb=new BorderLayout();  //�߽粼�֣����ÿؼ���ֱ����
		jl.setLayout(bb);
		//�����  �԰�ť��������
		jl.setHorizontalAlignment(SwingConstants.CENTER);  //���ÿؼ����Ҿ���
		jl.setFont(new java.awt.Font("����",1,12));//��������Ϊ���壬�����СΪ12��1������ʽ(1�Ǵ��壬0��ƽ����
		jl.setForeground(Color.red);//����������ɫ
		
		jf.frame();
		con.add(btn);
		con.add(jl);
	}

}