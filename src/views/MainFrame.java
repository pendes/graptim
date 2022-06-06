package views;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public SajatPanel mainPanel;
    public JButton goButton;

    public MainFrame() {

        this.goButton = new JButton("Mehet");
        this.mainPanel = new SajatPanel();

        


        this.setLayout(new BorderLayout());
        
        this.add(this.goButton, BorderLayout.NORTH);
        this.add(this.mainPanel, BorderLayout.CENTER);

        this.setTitle("App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    
}
