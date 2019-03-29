import java.awt.Graphics;

public class GameObject {
	int x=1;
    int y=1;
    int width;
    int height;
    boolean isAlive=true;
    public GameObject(int x,int y,int width,int height) {
    	this.x=x;
    	this.y=y;
    	this.width=width;
    	this.height=height;
    }
    void update() {

    }
    void draw(Graphics g) {
  
    }
}
