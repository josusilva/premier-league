
/**
 *  N�s (Giordano Trombetta, Josu� Silva, Fabio Junqueira), garantimos que:
 *  - N�o utilizamos c�digo fonte obtidos de outros estudantes,
 *    ou fonte n�o autorizada, seja modificado ou c�pia literal.
 *  - Todo c�digo usado em nosso trabalho � resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    c�digo publicado nos livros texto desta disciplina.
 *  - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.
 */

public class Game {

    private String homeTeam;
    private String awayTeam;
    private int goalsHome;
    private int goalsAway;
    private char result;
    private int shootsHome;
    private int shootsAway;
    private String date;

    public Game(){
    }

    public Game(String homeTeam, String awayTeam, int goalsHome, int goalsAway, char result, int shootsHome, int shootsAway, String date) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goalsHome = goalsHome;
        this.goalsAway = goalsAway;
        this.result = result;
        this.shootsHome = shootsHome;
        this.shootsAway = shootsAway;
        this.date = date;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getGoalsHome() {
        return goalsHome;
    }

    public void setGoalsHome(int goalsHome) {
        this.goalsHome = goalsHome;
    }

    public int getGoalsAway() {
        return goalsAway;
    }

    public void setGoalsAway(int goalsAway) {
        this.goalsAway = goalsAway;
    }

    public char getResult() {
        return result;
    }

    public void setResult(char result) {
        this.result = result;
    }

    public int getShootsHome() {
        return shootsHome;
    }

    public void setShootsHome(int shootsHome) {
        this.shootsHome = shootsHome;
    }

    public int getShootsAway() {
        return shootsAway;
    }

    public void setShootsAway(int shootsAway) {
        this.shootsAway = shootsAway;
    }

    public String toString(){
        String temp = "";
        temp = temp+"Home Team: "+homeTeam+"\n";
        temp = temp+"Away Team: "+awayTeam+"\n";
        temp = temp+"Score: "+goalsHome+"-"+goalsAway+"\n";
        temp = temp+"Result "+result+"\n";
        temp = temp+"Home Shoots: "+shootsHome+"\n";
        temp = temp+"Away Shoots: "+shootsAway+"\n";
        temp = temp+"Date: "+date+"\n";
        return temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
