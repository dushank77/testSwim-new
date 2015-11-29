
package testswim;

public class Vistle {
    long startTime=0;
    public void blow(){
        //give sound
        this.startTime= System.nanoTime();
    }
    
    public long getStartTime(){
        return startTime;
    }
}

