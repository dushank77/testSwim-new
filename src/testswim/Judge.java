
package testswim;

public class Judge extends Person{
    
    public static int judgeCount;
    ScoreBoard scoreBoard;
    
    public Judge(ScoreBoard scoreBoard,String name){
        this.name=name;
        this.scoreBoard=scoreBoard;
        judgeCount++;
        
    }
    
}
