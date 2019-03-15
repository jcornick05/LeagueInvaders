import java.awt.Graphics;

public class GameObject {
	int x=1;
    int y=1;
    int width;
    int height;
    public GameObject(int x,int y,int width,int height) {
    	this.x=x;
    	this.y=y;
    }
    void update() {
    	x+=1;
    	y+=1;
    }
    void draw(Graphics q) {
    	q.fillRect(x, y, 20, 20);
    }
}
