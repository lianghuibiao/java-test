package practise;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class PractiseFourth extends JFrame {    
    private myPanle1 myPanle;    
    public static void main(String[] args) {
    	PractiseFourth Test = new PractiseFourth();
    }
    
    public PractiseFourth() {
        myPanle = new myPanle1();
        this.add(myPanle);
        this.addKeyListener(myPanle);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

@SuppressWarnings("serial")
class myPanle1 extends JPanel implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    	 if (e.getKeyCode()==37){
             System.out.println("k��");
         } 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
           switch (e.getKeyCode()) {
		case 37:
			System.out.println("aa");
			break;
case 38:
	System.out.println("aa");
			break;
case 39:
	System.out.println("aa");
	break;
case 40:
	System.out.println("aa");
	break;
		
		}
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
    	 if (e.getKeyCode()==37){
             System.out.println("k��");
         } 
    }

}