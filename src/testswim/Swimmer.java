/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswim;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


/**
 *
 * @author Dushan
 */
public class Swimmer extends Person implements Runnable {

    String gender;
    SwimmingGUI swimmingGui;
    JLabel swimmingLabel;
    int distance = 0;
    int sleep;
    public static int swimmerCount;
    public double duration;
    long endTime;
    Swimmer swimmer;
    public TouchPad touchPad;
    public ScoreBoard scoreBoard;
    
    Swimmer(ScoreBoard scoreBoard,String name, int age, String gender, int sleep) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sleep = sleep;
        this.swimmer = this;
        swimmerCount++;
//        System.out.println(swimmerCount + " swimmer " + this.name + " created.");
        System.out.println(sleep);
        touchPad=new TouchPad();
        this.scoreBoard=scoreBoard;
    }

    public String getName() {       //get swimmer's name
        return this.name;
    }

    public void runLabel(JLabel myLabel, int y) {
        int x = myLabel.getX();
        new Thread() {
            @Override
            public void run() {
                while (myLabel.getX() < 700) {
                    if (myLabel.getX() < x + 700) {
                        distance += 5;

                        myLabel.setLocation(myLabel.getX() + 5, myLabel.getY());

                        myLabel.repaint();

                        if (distance == 690) {
                            swimmer.touchPad.setTouched();
                            scoreBoard.createScore(swimmer);
                        }

                    }
                    try {
                        Thread.sleep(y);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SwimmingGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }.start();

    }

    public void setGuiAddress(SwimmingGUI swimmingGui) {
        this.swimmingGui = swimmingGui;
    }

    public void setJPanelAddress(JLabel swimmingLabel) {
        this.swimmingLabel = swimmingLabel;
    }

    void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return this.duration;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
