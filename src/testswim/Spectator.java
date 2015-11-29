
package testswim;

public class Spectator extends Person {
    
    public static int spectatorCount;
    ScoreBoard scoreBoard;
    
    public Spectator(ScoreBoard scoreBoard,String name){
        this.name=name;
        this.scoreBoard=scoreBoard;
        spectatorCount++;
    }
    
}
