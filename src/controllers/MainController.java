package controllers;

import javax.swing.Timer;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    Timer timer;
    
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();

        this.mainFrame.goButton.addActionListener(e -> onClickGoButton());
        this.timer = new Timer(400, e -> onTimer());
    }    
    private void onClickGoButton() {
        System.out.println("start");
        this.timer.start();
    }

    private void onTimer() {
        System.out.println("idő van");
        this.mainFrame.mainPanel.move();
        this.mainFrame.mainPanel.repaint();
    }
    
}
