import java.awt.*;

public class AnotherEntity extends Entity {
    public AnotherEntity(float x, float y) {
        super(x, y);
        color = Color.decode("0xCD0d0d");
    }

    @Override
    public void update() {
        x += velX;
        y += velY;
        bound(Main.MAP_WIDTH, Main.MAP_HEIGHT);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int)x, (int)y, radius * 2, radius * 2);
    }
}
