import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer; 

GameObject go;
@Override

public void paintComponent(Graphics g){
	 g.fillRect(10, 10, 100, 100);
  
        }
@Override
public void actionPerformed(ActionEvent e) {
repaint();	
}
public GamePanel() {
	timer= new Timer(1000/60,this);
	go=new GameObject(10,10,10,10);
}
void startGame() {
	timer.start();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("how are you?");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Como estas?");
}
}
