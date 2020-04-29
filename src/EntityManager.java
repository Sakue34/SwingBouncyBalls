import java.util.ArrayList;

public class EntityManager {
    ArrayList<Entity> entityList;

    public EntityManager(int numberOf1, int numberOf2) {
        entityList = new ArrayList<>(numberOf1 + numberOf2);

        for(int i = 0; i < numberOf1; i++) {
            entityList.add(new SomeEntity((float) (Math.random() * Main.MAP_WIDTH),
                    (float) (Math.random() * Main.MAP_HEIGHT)));
        }
        for(int i = 0; i < numberOf2; i++) {
            entityList.add(new AnotherEntity((float) (Math.random() * Main.MAP_WIDTH),
                    (float) (Math.random() * Main.MAP_HEIGHT)));
        }
    }

    public void updateEveryEntity() {
        for (Entity entity : entityList) {
            entity.update();
        }
    }

    public ArrayList<Entity> getEntityList() {
        return entityList;
    }
}
