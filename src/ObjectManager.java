import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket;
 ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

	public ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}

	void update() {
		rocket.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();

		}
	}
	

	void draw(Graphics g) {
		rocket.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);

		}
	}

	 void addProjectile(Projectile p) {
		projectiles.add(p);
	}

}
