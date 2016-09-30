package mastermind;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Draw a pion on the surface
 * @author vanrooijen
 */
public class Pion {
    final int pinRadius = 15;
    
    private final Color pinColor = Color.LIGHT_GRAY;
 
    public void drawPion( Graphics g, int posX, int posY ) {            
        g.setColor(pinColor);
        g.fillOval(posX, posY, pinRadius, pinRadius);
        g.setColor(Color.BLACK);
        g.drawOval(posX, posY, pinRadius, pinRadius);
    }
}
