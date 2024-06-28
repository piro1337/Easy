package EasyGame;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Graphicist
 */
public class Graphicist extends JPanel{
    Graphics2D g2;
    BufferedImage img;

    public Graphicist(int width, int height){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 800);
        jf.add(this);

        jf.setVisible(true);
        img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        g2 = img.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, width, height);
        g2.setColor(Color.BLACK);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }

    public void rePaint(){
        repaint();
    }

    public void fillRect(int x, int y, int width, int height){
        g2.fillRect(x, y, width, height);
    }

    public void setColor(Color c){
        g2.setColor(c);
    }

    public void drawLine(int x1, int y1, int x2, int y2){
        g2.drawLine(x1, y1, x2, y2);
    }
}