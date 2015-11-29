
package testswim;

public class TouchPad {
    boolean touched;
    long touchTime;
    
    
    public boolean getTouched(){
        return this.touched;
    }
    
    public void setTouched(){
        this.touched=true;
        this.touchTime=System.nanoTime();
        
    }
    
    public long getTouchedTime(){
        this.setTouched();
        this.touchTime=System.nanoTime();
        return this.touchTime;
    }
        
}
