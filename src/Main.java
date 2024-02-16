import com.solitudeworks.game.Game;
import com.solitudeworks.ui.GameWindow;

import java.awt.*;

public class Main {

    private static final int FPS = 60;

    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Game game = new Game();

        while (GameWindow.instance.isVisible() && game.isRunning()) {
            game.update();
            GameWindow.instance.repaint();
            toolkit.sync();
            Thread.sleep(1000 / FPS);
        }

        System.exit(0);

    }

}