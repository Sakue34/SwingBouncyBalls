import java.awt.*;

public class SomeEntity extends Entity {
    public SomeEntity(float x, float y) {
        super(x, y);
        color = Color.decode("0x00ddaa");
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
