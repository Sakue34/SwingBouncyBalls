import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPane extends JPanel {

    EntityManager entityManager = new EntityManager(20, 20);

    public TestPane() {
        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entityManager.updateEveryEntity();
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Main.MAP_WIDTH, Main.MAP_HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < entityManager.getEntityList().size(); i++) {
            EntityDrawManager.drawEveryEntity(entityManager.getEntityList(), g);
        }
    }
}
