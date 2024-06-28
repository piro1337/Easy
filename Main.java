package EasyGame;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static int x = 200;
    public static void main(String[] args) {
        Graphicist g = new Graphicist(800,800);
        g.fillRect(10, 10, 100, 100);

        g.setColor(Color.CYAN);

        g.drawLine(50, 50, 800, 800);
        g.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                x+=10;
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, 1000, 1000);
                g.setColor(Color.CYAN);
                g.fillRect(x, 200, 200, 200);
                g.rePaint();
                System.out.println(x);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            @Override
            public void keyTyped(KeyEvent e) {
                
            }
        });
    }
}