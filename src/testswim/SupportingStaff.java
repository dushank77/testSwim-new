
package testswim;

public class SupportingStaff extends Person {
    
    public static int supportingStaffCount;
    ScoreBoard scoreBoard;

    public SupportingStaff(ScoreBoard scoreBoard,String name){
        this.name=name;
        this.scoreBoard=scoreBoard;
        supportingStaffCount++;
    }
    
}
