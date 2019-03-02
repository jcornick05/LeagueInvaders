import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel gp;
	final int width=500;
	final int height=800;
	
public static void main(String[] args) {

	LeagueInvaders l = new LeagueInvaders();
	l.setup();

}
	public LeagueInvaders() {
		frame = new JFrame("League Invaders");
		gp= new GamePanel();
	}
	void setup() {
		frame.add(gp);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
         frame.addKeyListener(gp);
		
	    frame.pack();
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gp.startGame();
	}
}

