package mastermind;

import java.awt.*;
import javax.swing.*;

/**
 * Creates panel that contains 'pions'
 * @author vanrooijen
 */
public class PanelCombination extends JPanel {
    
    private Pion pion1 = new Pion();
    private Pion pion2 = new Pion();
    private Pion pion3 = new Pion();
    private Pion pion4 = new Pion();
   
    public PanelCombination() {
        initPanelCombination();
    }
    
    private void initPanelCombination() {
        setBounds(10, 10, 150, 30);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.ORANGE);
    }
    
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
     
        getPion1().drawPion(g, 20, 8);
        getPion2().drawPion(g, 50, 8);
        getPion3().drawPion(g, 80, 8);
        getPion4().drawPion(g, 110, 8);
    }

    /**
     * @return the pion1
     */
    public Pion getPion1() {
        return pion1;
    }

    /**
     * @param pion1 the pion1 to set
     */
    public void setPion1(Pion pion1) {
        this.pion1 = pion1;
    }

    /**
     * @return the pion2
     */
    public Pion getPion2() {
        return pion2;
    }

    /**
     * @param pion2 the pion2 to set
     */
    public void setPion2(Pion pion2) {
        this.pion2 = pion2;
    }

    /**
     * @return the pion3
     */
    public Pion getPion3() {
        return pion3;
    }

    /**
     * @param pion3 the pion3 to set
     */
    public void setPion3(Pion pion3) {
        this.pion3 = pion3;
    }

    /**
     * @return the pion4
     */
    public Pion getPion4() {
        return pion4;
    }

    /**
     * @param pion4 the pion4 to set
     */
    public void setPion4(Pion pion4) {
        this.pion4 = pion4;
    }
}