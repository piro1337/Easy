package EasyGame;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Graphicist g = new Graphicist(800,800);
        g.fillRect(10, 10, 100, 100);

        g.setColor(Color.CYAN);
        g.fillRect(200, 200, 200, 200);
        g.drawLine(50, 50, 800, 800);
    }
}