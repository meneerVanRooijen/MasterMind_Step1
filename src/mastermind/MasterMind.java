package mastermind;

import javax.swing.JFrame;

/**
 * Entry point for application MasterMind
 * @author vanrooijen
 */
public class MasterMind extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame mmFrame = new MasterMind();
        mmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mmFrame.setContentPane(new PanelMain());
        mmFrame.setBounds(300, 100, 400, 600);
        mmFrame.setVisible(true);
    }
}