package mastermind;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * Panel holding the multiple panelCombination's
 * @author vanrooijen
 */
public class PanelCombinations extends JPanel {    

    public PanelCombinations() {
        initPanelCombinations();
        addPanels();
    }
    
    private void initPanelCombinations() {
        setLayout(null);
        setBounds(20, 100, 250, 350);
        setBackground(Color.WHITE);
    }
    
    private void addPanels() {
        add(new PanelCombination());
    }
}