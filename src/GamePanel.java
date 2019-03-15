import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer; 
final int MENU_STATE=0;
final int GAME_STATE=1;
final int END_STATE=2;
int currentSTATE=MENU_STATE;
@Override

public void paintComponent(Graphics g){
     
        }
@Override
public void actionPerformed(ActionEvent e) {

	repaint();	
	System.out.println("action");
	if(currentSTATE == MENU_STATE){
		currentSTATE=0;
}else if(currentSTATE == GAME_STATE){
     currentSTATE=1;
}else if(currentSTATE== END_STATE){
	currentSTATE=2;
}

}
public GamePanel() {
	timer= new Timer(1000/60,this);
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
void drawMenuState(Graphics g) {
	
}
void drawGameState(Graphics g) {
	
}
void drawEndState(Graphics g) {
	
}
}
