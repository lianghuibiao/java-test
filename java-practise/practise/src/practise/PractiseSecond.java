package practise;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;







public class PractiseSecond extends JFrame {
	//��������
	Image Chess=Toolkit.getDefaultToolkit().getImage("img/aaa.png");
	//��������
	Image wood=Toolkit.getDefaultToolkit().getImage("img/WOOD.GIF");
	private Image offScreenImage;  
	public void update(Graphics g) {//g��ǰ����Ļ�Ļ���  
	    if(offScreenImage == null)  
	        offScreenImage = this.createImage(WIDTH,HEIGHT);  
	    Graphics gOffScreen = offScreenImage.getGraphics();//gOffScreen�Ǳ�����Ļ�Ļ���  
	    Color c = gOffScreen.getColor();  
	    gOffScreen.setColor(Color.GREEN);  
	    gOffScreen.fillRect(0, 0, WIDTH,HEIGHT);//������     
	    gOffScreen.setColor(c);  
	    paint(gOffScreen);//�ڱ�����Ļ��  
	    g.drawImage(Chess,15+65,32+120,55,55,null);//��������Ļ��������ǰ����Ļ��  
	}  
	
	public void paint(Graphics g) {
		//�������� 
		g.drawImage(wood,0,32,600,559,null);
		int x=0;
		//int t=0;
		int b=0;
		//���ص�һ�ŵ�����
		for(int i=0;i<9;i++) {
			
			g.drawImage(Chess,15+x,32,55,55,null);
			
			x=x+65;
			
		}
		//���صڶ��ŵ�����
		g.drawImage(Chess,15+65,32+120,55,55,null);
		g.drawImage(Chess,15+450,32+120,55,55,null);
		//���ص����ŵ�����
			for(int i=0;i<5;i++) {
			
			Object a=g.drawImage(Chess,15+b,32+180,55,55,null);
			
			b=b+128;
			
		}
	  
	}
	//���ڼ���
		void Frame() {
			while(true) {
				repaint();
				try {
					//��ʮ����
					Thread.sleep(1000);  //һ��20��
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
			
		}

	
	public void setVisible(boolean b) {
		// TODO �Զ����ɵķ������
		super.setVisible(b);
	}
	@Override
	public void setSize(int width, int height) {
		// TODO �Զ����ɵķ������
		super.setSize(width, height);
	}
	@Override
	public void setLocation(int x, int y) {
		// TODO �Զ����ɵķ������
		super.setLocation(x, y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       //ʵ��д��main��������    ���������Ǽ���ͼƬ
		PractiseSecond jf=new PractiseSecond();
		
	    Container con=jf.getContentPane();
	    jf.setVisible(true);
	    jf.setSize(600,600);
	    jf.setLocation(400, 200);
	   // jf.paint(g);;
	    jf.Frame();
	  
	    
	    
	    
	}

}