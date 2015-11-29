
package testswim;

public class TestSwim {

    public static void main(String[] args) {
        Vistle vistle=new Vistle();
        ScoreBoard scoreBoard=new ScoreBoard(vistle);
        GetDetailsGUI detailsGui=new GetDetailsGUI(scoreBoard);
        detailsGui.setVisible(true);
        
        
    }
    
}
