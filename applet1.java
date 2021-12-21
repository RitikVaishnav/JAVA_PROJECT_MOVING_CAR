import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class applet1 extends Applet implements KeyListener
{
int x=40,y=40,z;
Label l;
 public void init()
    {
        addKeyListener(this);
	setFocusable(true);
      requestFocusInWindow();
    }
 
 public void paint(Graphics g)
 {
   
   
     setBackground(Color.black);
      z=getWidth();
      Color c1=new Color(20,160,200);
      Color c2=new Color(200,60,200);
      g.setColor(c1);
      g.drawLine(0,y+75,z,y+75);
      g.setColor(Color.red);
      g.fillRoundRect(x,y+20,100,40,5,5);
      g.fillArc(x+90,y+20,20,40,270,180);
      g.setColor(Color.BLUE);
      g.fillRoundRect(x+10,y,70,25,10,10);
      g.setColor(Color.white);
      g.fillRect(x+20,y+5,20,25);
      g.fillRect(x+50,y+5,20,25);
      g.setColor(Color.black);
      g.fillRoundRect(x+55,y+10,10,20,10,10);
      g.fillOval(x+10,y+50,25,25);
      g.fillOval(x+60,y+50,25,25);
      g.setColor(Color.white);
      g.fillOval(x+15,y+55,10,10);
      g.fillOval(x+65,y+55,10,10);
        
    
   
   
 }
public void keyPressed(KeyEvent k)
    {
        int key = k.getKeyCode();
 
        switch(key)
        {
            
            case KeyEvent.VK_RIGHT:
                x= x+ 10;
                break;
            case KeyEvent.VK_LEFT:
                x= x- 10;
                break;
            case KeyEvent.VK_UP:
                y= y-10;
                break;
             
            case KeyEvent.VK_DOWN:
               y=y+10;
                break;
 
        }
 
        repaint();
    }
public void keyTyped(KeyEvent ke) { }
public void keyReleased(KeyEvent ke) { }

public static void main(String[] args)
 {
   
      new applet1().show();
 }
}
