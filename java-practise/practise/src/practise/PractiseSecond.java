package practise;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;







public class PractiseSecond extends JFrame {
	//加载棋盘
	Image Chess=Toolkit.getDefaultToolkit().getImage("img/aaa.png");
	//加载棋子
	Image wood=Toolkit.getDefaultToolkit().getImage("img/WOOD.GIF");
	private Image offScreenImage;  
	public void update(Graphics g) {//g是前面屏幕的画笔  
	    if(offScreenImage == null)  
	        offScreenImage = this.createImage(WIDTH,HEIGHT);  
	    Graphics gOffScreen = offScreenImage.getGraphics();//gOffScreen是背后屏幕的画笔  
	    Color c = gOffScreen.getColor();  
	    gOffScreen.setColor(Color.GREEN);  
	    gOffScreen.fillRect(0, 0, WIDTH,HEIGHT);//画矩形     
	    gOffScreen.setColor(c);  
	    paint(gOffScreen);//在背后屏幕画  
	    g.drawImage(Chess,15+65,32+120,55,55,null);//将背后屏幕画的贴在前面屏幕上  
	}  
	
	public void paint(Graphics g) {
		//加载棋盘 
		g.drawImage(wood,0,32,600,559,null);
		int x=0;
		//int t=0;
		int b=0;
		//加载第一排的棋子
		for(int i=0;i<9;i++) {
			
			g.drawImage(Chess,15+x,32,55,55,null);
			
			x=x+65;
			
		}
		//加载第二排的棋子
		g.drawImage(Chess,15+65,32+120,55,55,null);
		g.drawImage(Chess,15+450,32+120,55,55,null);
		//加载第三排的棋子
			for(int i=0;i<5;i++) {
			
			Object a=g.drawImage(Chess,15+b,32+180,55,55,null);
			
			b=b+128;
			
		}
	  
	}
	//窗口加载
		void Frame() {
			while(true) {
				repaint();
				try {
					//四十毫秒
					Thread.sleep(1000);  //一秒20次
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
			
		}

	
	public void setVisible(boolean b) {
		// TODO 自动生成的方法存根
		super.setVisible(b);
	}
	@Override
	public void setSize(int width, int height) {
		// TODO 自动生成的方法存根
		super.setSize(width, height);
	}
	@Override
	public void setLocation(int x, int y) {
		// TODO 自动生成的方法存根
		super.setLocation(x, y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       //实例写在main方法里面    接下来就是加载图片
		PractiseSecond jf=new PractiseSecond();
		
	    Container con=jf.getContentPane();
	    jf.setVisible(true);
	    jf.setSize(600,600);
	    jf.setLocation(400, 200);
	   // jf.paint(g);;
	    jf.Frame();
	  
	    
	    
	    
	}

}
