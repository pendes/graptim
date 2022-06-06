package views;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SajatPanel extends JPanel{
    Graphics g;
    int x = 0;

    @Override
    public void paint(Graphics g) {
        this.g = g;
    }
    public void move() {        
        this.g.clearRect(this.x, 30, 100, 30);
        this.x += 10;
		this.g.setColor(Color.YELLOW);
		this.g.fillRect(this.x, 30, 100, 30);
    }
}
