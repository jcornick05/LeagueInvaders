import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int score = 0;
	int currentSTATE = MENU_STATE;

	Rocketship rocket = new Rocketship(250, 700, 50, 50);
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font description = new Font("Arial", Font.PLAIN, 30);
	ObjectManager om = new ObjectManager(rocket);

	@Override

	public void paintComponent(Graphics g) {
		if (currentSTATE == MENU_STATE) {
			drawMenuState(g);
		} else if (currentSTATE == GAME_STATE) {
			drawGameState(g);

		} else if (currentSTATE == END_STATE) {
			drawEndState(g);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
		// System.out.println("action");
		if (currentSTATE == MENU_STATE) {
			updateMenuState();
		} else if (currentSTATE == GAME_STATE) {
			updateGameState();

		} else if (currentSTATE == END_STATE) {
			updateEndState();

		}

	}

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
	}

	void startGame() {
		timer.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("hi");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("how are you?");
		// System.out.println(e.getKeyCode());
		if (e.getKeyCode() == 10) {

			if (currentSTATE == END_STATE) {
				rocket = new Rocketship(250, 750, 50, 50);
				om = new ObjectManager(rocket);
				System.out.println("thing");
			}
			if (currentSTATE > END_STATE) {
				currentSTATE = MENU_STATE;
			}
			currentSTATE++;

		}
		if (e.getKeyCode() == 39) {
			rocket.x += 20;
		}
		if (e.getKeyCode() == 37) {
			rocket.x -= 20;
		}
		if (e.getKeyCode() == 40) {
			rocket.y += 20;
		}
		if (e.getKeyCode() == 38) {
			rocket.y -= 20;
		}
		if (e.getKeyCode() == 32) {
			om.addProjectile(new Projectile(rocket.x + 25, rocket.y - 25, 10, 10));
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Como estas?");
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setColor(Color.ORANGE);
		g.setFont(titleFont);
		g.drawString("LeagueInvaders", 100, 200);
		g.setFont(description);
		g.drawString("Press ENTER To start", 100, 400);
		g.drawString("Press SPACE To start", 100, 600);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		om.draw(g);

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("GAME OVER!!", 100, 300);

	}

	void updateMenuState() {

	}

	void updateGameState() {
		om.update();
		om.manageEnemies();
		om.checkCollision();
		om.purgeObjects();
		if (rocket.isAlive == false) {
			currentSTATE = END_STATE;
		}
	}

	void updateEndState() {

	}

}
