
package testswim;

public class ScoreBoard {
    
    public Vistle vistle;
    SwimmingGUI swimmingGui;
    static int winningCount;
    TouchPad touchPad;
    Swimmer swimmer1;
    Swimmer swimmer2;
    Swimmer swimmer3;
    Swimmer swimmer4;
    Swimmer swimmer5;

    public ScoreBoard(Vistle vistle) {
        this.vistle=vistle;
    }
    
    
    
    
    public void createScore(Swimmer swimmer) {
        
        long startTime = vistle.getStartTime();
        
        winningCount++;
        
        
        if (swimmer==swimmer1) {
            swimmer1.endTime=swimmer1.touchPad.touchTime;
            swimmer1.setDuration((swimmer1.endTime - startTime) / 1000000.0);
            swimmingGui.displayScoreSwimmer1(getTimeInBasicFormat(swimmer1.getDuration()),Integer.toString(winningCount));
            
        } else if (swimmer==swimmer2) {
            swimmer2.endTime=swimmer2.touchPad.touchTime;
            swimmer2.setDuration((swimmer2.endTime - startTime) / 1000000.0);
            swimmingGui.displayScoreSwimmer2(getTimeInBasicFormat(swimmer2.getDuration()),Integer.toString(winningCount));
            
        }  else if (swimmer==swimmer3) {
            swimmer3.endTime=swimmer3.touchPad.touchTime;
            swimmer3.setDuration((swimmer3.endTime - startTime) / 1000000.0);
            swimmingGui.displayScoreSwimmer3(getTimeInBasicFormat(swimmer3.getDuration()),Integer.toString(winningCount));
            
        }  else if (swimmer==swimmer4) {
            swimmer4.endTime=swimmer4.touchPad.touchTime;
            swimmer4.setDuration((swimmer4.endTime - startTime) / 1000000.0);
            swimmingGui.displayScoreSwimmer4(getTimeInBasicFormat(swimmer4.getDuration()),Integer.toString(winningCount));
            
        }  else if (swimmer==swimmer5) {
            swimmer5.endTime=swimmer5.touchPad.touchTime;
            swimmer5.setDuration((swimmer5.endTime - startTime) / 1000000.0);
            swimmingGui.displayScoreSwimmer5(getTimeInBasicFormat(swimmer5.getDuration()),Integer.toString(winningCount));
        }
    }
    
    private String getTimeInBasicFormat(double time){
        String timeString="  ";
        timeString += Integer.toString((int)(time/1000))+" S   ";
        timeString+=Double.toString((int)(time%1000))+" mS";
        return timeString;
    }
}
