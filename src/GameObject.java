import java.awt.Graphics;

public class GameObject {
	int x;
    int y;
    int width;
    int height;
    public GameObject(int x,int y,int width,int height) {
    	
    }
    void Update() {
    	
    }
    void draw(Graphics q) {
    	q.fillRect(10, 10, 100, 100);
    }
}
