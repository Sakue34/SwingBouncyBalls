import java.awt.*;

public abstract class Entity {
    public float x;
    public float y;
    Color color;
    int radius = 8;

    public float velX;
    public float velY;

    protected void bound(int width, int height) {
        if (x < 0) {
            x = 0.0f;
            velX *= -1.0F;
        }
        if (x > width) {
            x = width;
            velX *= -1.0F;
        }
        if (y < 0) {
            y = 0.0f;
            velY *= -1.0F;
        }
        if (y > height) {
            y = height;
            velY *= -1.0F;
        }
    }

    protected Entity(float x, float y) {
        this.x = x;
        this.y = y;
        velX = (float)Math.random() * 4.0F - 2.0F;
        velY = (float)Math.random() * 4.0F - 2.0F;
    }
    
    public abstract void draw(Graphics g);
    
    public abstract void update();
}
