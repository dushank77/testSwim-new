package testswim;

import java.util.ArrayList;
import java.util.Random;

public class AddPeople {

    GetDetailsGUI detailgui;

    Swimmer swimmer1, swimmer2, swimmer3, swimmer4, swimmer5;
    Judge mainJudge, judge1, judge2, judge3, judge4, judge5;
    SupportingStaff supportingStaff1, supportingStaff2, supportingStaff3, supportingStaff4, supportingStaff5;
    Spectator spectator1, spectator2, spectator3, spectator4, spectator5, spectator6, spectator7, spectator8, spectator9, spectator10;
    Spectator spectator11, spectator12, spectator13, spectator14, spectator15, spectator16, spectator17, spectator18, spectator19, spectator20;
    ArrayList<Person> allpeople;
    ScoreBoard scoreBoard;

    public AddPeople(ScoreBoard scoreBoard) {
        allpeople=new ArrayList<>();
        this.scoreBoard=scoreBoard;
    }
    
    
    public void setGuiAddress(GetDetailsGUI detailgui){
        this.detailgui=detailgui;
    }

    public void createSwimmers() {
        String gender = detailgui.getGender();
        Random randomNum=new Random();
//        System.out.println(detailgui.getSwimmer1name().length());
//        System.out.println(detailgui.getSwimmer1age().length());
        if (detailgui.getSwimmer1name().length() != 0 && detailgui.getSwimmer1age().length() != 0) {
            swimmer1 = new Swimmer(this.scoreBoard,detailgui.getSwimmer1name(), Integer.valueOf(detailgui.getSwimmer1age()), gender,randomNum.nextInt(25)+50);
            scoreBoard.swimmer1=swimmer1;
            swimmer1.scoreBoard=scoreBoard;
            this.allpeople.add(swimmer1);
        }
        if (detailgui.getSwimmer2name().length() != 0 && detailgui.getSwimmer2age().length() != 0) {
            swimmer2 = new Swimmer(this.scoreBoard,detailgui.getSwimmer2name(), Integer.valueOf(detailgui.getSwimmer2age()), gender,randomNum.nextInt(25)+50);
            scoreBoard.swimmer2=swimmer2;
            swimmer1.scoreBoard=scoreBoard;
            allpeople.add(swimmer2);
        }
        if (detailgui.getSwimmer3name().length() != 0 && detailgui.getSwimmer3age().length() != 0) {
            swimmer3 = new Swimmer(this.scoreBoard,detailgui.getSwimmer3name(), Integer.valueOf(detailgui.getSwimmer3age()), gender,randomNum.nextInt(25)+50);
            scoreBoard.swimmer3=swimmer3;
            swimmer1.scoreBoard=scoreBoard;
            allpeople.add(swimmer3);
        }
        if (detailgui.getSwimmer4name().length() != 0 && detailgui.getSwimmer4age().length() != 0) {
            swimmer4 = new Swimmer(this.scoreBoard,detailgui.getSwimmer4name(), Integer.valueOf(detailgui.getSwimmer4age()), gender,randomNum.nextInt(25)+50);
            scoreBoard.swimmer4=swimmer4;
            swimmer1.scoreBoard=scoreBoard;
            allpeople.add(swimmer4);
        }
        if (detailgui.getSwimmer5name().length() != 0 && detailgui.getSwimmer5age().length() != 0) {
            swimmer5 = new Swimmer(this.scoreBoard,detailgui.getSwimmer5name(), Integer.valueOf(detailgui.getSwimmer5age()), gender,randomNum.nextInt(25)+50);
            scoreBoard.swimmer5=swimmer5;
            swimmer1.scoreBoard=scoreBoard;
            allpeople.add(swimmer5);
        }
    }

    public void createJudges() {
        if (detailgui.getMainJudgename().length() != 0) {
            mainJudge = new Judge(this.scoreBoard,detailgui.getMainJudgename());
            allpeople.add(mainJudge);
        }
        if (detailgui.getJudge1name().length() != 0) {
            judge1 = new Judge(this.scoreBoard,detailgui.getJudge1name());
            allpeople.add(judge1);
        }
        if (detailgui.getJudge2name().length() != 0) {
            judge2 = new Judge(this.scoreBoard,detailgui.getJudge2name());
            allpeople.add(judge2);
        }
        if (detailgui.getJudge3name().length() != 0) {
            judge3 = new Judge(this.scoreBoard,detailgui.getJudge3name());
            allpeople.add(judge3);
        }
        if (detailgui.getJudge4name().length() != 0) {
            judge4 = new Judge(this.scoreBoard,detailgui.getJudge4name());
            allpeople.add(judge4);
        }
        if (detailgui.getJudge5name().length() != 0) {
            judge5 = new Judge(this.scoreBoard,detailgui.getJudge5name());
            allpeople.add(judge5);
        }
    }

    private void createSupportingStaff() {
        if (detailgui.getSupportingStaff1name().length() != 0) {
            supportingStaff1 = new SupportingStaff(this.scoreBoard,detailgui.getSupportingStaff1name());
            allpeople.add(supportingStaff1);
        }
        if (detailgui.getSupportingStaff2name().length() != 0) {
            supportingStaff2 = new SupportingStaff(this.scoreBoard,detailgui.getSupportingStaff2name());
            allpeople.add(supportingStaff2);
        }
        if (detailgui.getSupportingStaff3name().length() != 0) {
            supportingStaff3 = new SupportingStaff(this.scoreBoard,detailgui.getSupportingStaff3name());
            allpeople.add(supportingStaff3);
        }
        if (detailgui.getSupportingStaff4name().length() != 0) {
            supportingStaff4 = new SupportingStaff(this.scoreBoard,detailgui.getSupportingStaff4name());
            allpeople.add(supportingStaff4);
        }
        if (detailgui.getSupportingStaff5name().length() != 0) {
            supportingStaff5 = new SupportingStaff(this.scoreBoard,detailgui.getSupportingStaff5name());
            allpeople.add(supportingStaff5);
        }
    }

    private void createSpectators() {
        if (detailgui.getSpectator1name().length() != 0) {
            spectator1 = new Spectator(this.scoreBoard,detailgui.getSpectator1name());
            allpeople.add(spectator1);
        }
        if (detailgui.getSpectator2name().length() != 0) {
            spectator2 = new Spectator(this.scoreBoard,detailgui.getSpectator2name());
            allpeople.add(spectator2);
        }
        if (detailgui.getSpectator3name().length() != 0) {
            spectator3 = new Spectator(this.scoreBoard,detailgui.getSpectator3name());
            allpeople.add(spectator3);
        }
        if (detailgui.getSpectator4name().length() != 0) {
            spectator4 = new Spectator(this.scoreBoard,detailgui.getSpectator4name());
            allpeople.add(spectator4);
        }
        if (detailgui.getSpectator5name().length() != 0) {
            spectator5 = new Spectator(this.scoreBoard,detailgui.getSpectator5name());
            allpeople.add(spectator5);
        }
        if (detailgui.getSpectator6name().length() != 0) {
            spectator6 = new Spectator(this.scoreBoard,detailgui.getSpectator6name());
            allpeople.add(spectator6);
        }
        if (detailgui.getSpectator7name().length() != 0) {
            spectator7 = new Spectator(this.scoreBoard,detailgui.getSpectator7name());
            allpeople.add(spectator7);
        }
        if (detailgui.getSpectator8name().length() != 0) {
            spectator8 = new Spectator(this.scoreBoard,detailgui.getSpectator8name());
            allpeople.add(spectator8);
        }
        if (detailgui.getSpectator9name().length() != 0) {
            spectator9 = new Spectator(this.scoreBoard,detailgui.getSpectator9name());
            allpeople.add(spectator9);
        }
        if (detailgui.getSpectator10name().length() != 0) {
            spectator10 = new Spectator(this.scoreBoard,detailgui.getSpectator10name());
            allpeople.add(spectator10);
        }
        if (detailgui.getSpectator11name().length() != 0) {
            spectator11 = new Spectator(this.scoreBoard,detailgui.getSpectator11name());
            allpeople.add(spectator11);
        }
        if (detailgui.getSpectator12name().length() != 0) {
            spectator12 = new Spectator(this.scoreBoard,detailgui.getSpectator12name());
            allpeople.add(spectator12);
        }
        if (detailgui.getSpectator13name().length() != 0) {
            spectator13 = new Spectator(this.scoreBoard,detailgui.getSpectator13name());
            allpeople.add(spectator13);
        }
        if (detailgui.getSpectator14name().length() != 0) {
            spectator14 = new Spectator(this.scoreBoard,detailgui.getSpectator14name());
            allpeople.add(spectator14);
        }
        if (detailgui.getSpectator15name().length() != 0) {
            spectator15 = new Spectator(this.scoreBoard,detailgui.getSpectator15name());
            allpeople.add(spectator15);
        }
        if (detailgui.getSpectator16name().length() != 0) {
            spectator16 = new Spectator(this.scoreBoard,detailgui.getSpectator16name());
            allpeople.add(spectator16);
        }
        if (detailgui.getSpectator17name().length() != 0) {
            spectator17 = new Spectator(this.scoreBoard,detailgui.getSpectator17name());
            allpeople.add(spectator17);
        }
        if (detailgui.getSpectator18name().length() != 0) {
            spectator18 = new Spectator(this.scoreBoard,detailgui.getSpectator18name());
            allpeople.add(spectator18);
        }
        if (detailgui.getSpectator19name().length() != 0) {
            spectator19 = new Spectator(this.scoreBoard,detailgui.getSpectator19name());
            allpeople.add(spectator19);
        }
        if (detailgui.getSpectator20name().length() != 0) {
            spectator20 = new Spectator(this.scoreBoard,detailgui.getSpectator20name());
            allpeople.add(spectator20);
        }
    }

    public void addall() {
        this.createSwimmers();
        this.createJudges();
        this.createSupportingStaff();
        this.createSpectators();

    }
    
    public void printCountOfPersons(){
        System.out.println("Swimmer count is: "+Swimmer.swimmerCount);
        System.out.println("Judge count is: "+Judge.judgeCount);
        System.out.println("Supporting staff count is: "+SupportingStaff.supportingStaffCount);
        System.out.println("Spectator count is: "+Spectator.spectatorCount);
        System.out.println("Total person count is: "+Person.personCount);
    }

}
