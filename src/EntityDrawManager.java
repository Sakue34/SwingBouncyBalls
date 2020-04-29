import java.awt.*;
import java.util.ArrayList;

public class EntityDrawManager {
    public static void drawEveryEntity(ArrayList<Entity> entityList, Graphics g) {
        for (Entity entity : entityList) {
            entity.draw(g);
        }
    }
}
