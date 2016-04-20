

/**
 *  N�s (Giordano Trombetta, Josu� Silva, Fabio Junqueira), garantimos que:
 *  - N�o utilizamos c�digo fonte obtidos de outros estudantes,
 *    ou fonte n�o autorizada, seja modificado ou c�pia literal.
 *  - Todo c�digo usado em nosso trabalho � resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    c�digo publicado nos livros texto desta disciplina.
 *  - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.
 */
public class Team {

    private String name;
    private int matchesPlayedHome;
    private int matchesPlayedAway;
    private int homeWin;
    private int awayWin;
    private int homeDraw;
    private int awayDraw;
    private int homeLose;
    private int awayLose;
    private int homeGoalsFor;
    private int homeGoalsAgainst;
    private int awayGoalsFor;
    private int awayGoalsAgainst;
    private int shoots;
    private int homeWinHT;
    private int homeDrawHT;
    private int homeLoseHT;
    private int awayWinHT;
    private int awayDrawHT;
    private int awayLoseHT;
    private int matchesPlayedHomeHT;
    private int matchesPlayedAwayHT;
    private int homeGoalsForHT;
    private int homeGoalsAgainstHT;
    private int awayGoalsForHT;
    private int awayGoalsAgainstHT;

    public Team(String name) {
        this.name = name;
        this.matchesPlayedHome = 0;
        this.matchesPlayedAway = 0;
        this.homeWin = 0;
        this.awayWin = 0;
        this.homeDraw = 0;
        this.awayDraw = 0;
        this.homeLose = 0;
        this.awayLose = 0;
        this.homeGoalsFor = 0;
        this.homeGoalsAgainst = 0;
        this.awayGoalsFor = 0;
        this.awayGoalsAgainst = 0;
        this.shoots = 0;
        this.homeWinHT = 0;
        this.homeDrawHT = 0;
        this.homeLoseHT = 0;
        this.awayWinHT = 0;
        this.awayDrawHT = 0;
        this.awayLoseHT = 0;
        this.matchesPlayedHomeHT = 0;
        this.matchesPlayedAwayHT = 0;
        this.homeGoalsForHT = 0;
        this.homeGoalsAgainstHT = 0;
        this.awayGoalsForHT = 0;
        this.awayGoalsAgainstHT = 0;
    }

    public void addAwayStats(int awayWin, int awayDraw, int awayLose, int awayGoalsFor, int awayGoalsAgainst, int shoots) {

        this.matchesPlayedAway++;
        this.awayWin = this.awayWin + awayWin;
        this.awayDraw = this.awayDraw + awayDraw;
        this.awayLose = this.awayLose + awayLose;
        this.awayGoalsFor = this.awayGoalsFor + awayGoalsFor;
        this.awayGoalsAgainst = this.awayGoalsAgainst + awayGoalsAgainst;
        this.shoots = this.shoots + shoots;

    }

    public void addHomeStats(int homeWin, int homeDraw, int homeLose, int homeGoalsFor, int homeGoalsAgainst, Integer integer) {

        this.matchesPlayedHome++;
        this.homeWin = this.homeWin + homeWin;
        this.homeDraw = this.homeDraw + homeDraw;
        this.homeLose = this.homeLose + homeLose;
        this.homeGoalsFor = this.homeGoalsFor + homeGoalsFor;
        this.homeGoalsAgainst = this.homeGoalsAgainst + homeGoalsAgainst;

    }

    public void addAwayStatsHT(int awayWin, int awayDraw, int awayLose, int awayGoalsFor, int awayGoalsAgainst) {

        this.matchesPlayedAwayHT++;
        this.awayWinHT = this.awayWinHT + awayWin;
        this.awayDrawHT = this.awayDrawHT + awayDraw;
        this.awayLoseHT = this.awayLoseHT + awayLose;
        this.awayGoalsForHT = this.awayGoalsForHT + awayGoalsFor;
        this.awayGoalsAgainstHT = this.awayGoalsAgainstHT + awayGoalsAgainst;

    }

    public void addHomeStatsHT(int homeWin, int homeDraw, int homeLose, int homeGoalsFor, int homeGoalsAgainst) {

        this.matchesPlayedHomeHT++;
        this.homeWinHT = this.homeWinHT + homeWin;
        this.homeDrawHT = this.homeDrawHT + homeDraw;
        this.homeLoseHT = this.homeLoseHT + homeLose;
        this.homeGoalsForHT = this.homeGoalsForHT + homeGoalsFor;
        this.homeGoalsAgainstHT = this.homeGoalsAgainstHT + homeGoalsAgainst;

    }

    public String getName() {
        return name;
    }
    
    public int getMatchesPlayed(){
    	return matchesPlayedHome + matchesPlayedAway;
    }

    public int getMatchesPlayedHome() {
        return matchesPlayedHome;
    }

    public int getMatchesPlayedAway() {
        return matchesPlayedAway;
    }

    public int getHomeWin() {
        return homeWin;
    }

    public int getAwayWin() {
        return awayWin;
    }

    public int getHomeDraw() {
        return homeDraw;
    }

    public int getAwayDraw() {
        return awayDraw;
    }

    public int getHomeLose() {
        return homeLose;
    }

    public int getAwayLose() {
        return awayLose;
    }

    public int getHomeGoalsFor() {
        return homeGoalsFor;
    }

    public int getHomeGoalsAgainst() {
        return homeGoalsAgainst;
    }

    public int getAwayGoalsFor() {
        return awayGoalsFor;
    }

    public int getAwayGoalsAgainst() {
        return awayGoalsAgainst;
    }

    public int getShoots() {
        return shoots;
    }

    public int getHomeWinHT() {
        return homeWinHT;
    }

    public int getHomeDrawHT() {
        return homeDrawHT;
    }

    public int getHomeLoseHT() {
        return homeLoseHT;
    }

    public int getAwayWinHT() {
        return awayWinHT;
    }

    public int getAwayDrawHT() {
        return awayDrawHT;
    }

    public int getAwayLoseHT() {
        return awayLoseHT;
    }

    public int getMatchesPlayedHomeHT() {
        return matchesPlayedHomeHT;
    }

    public int getMatchesPlayedAwayHT() {
        return matchesPlayedAwayHT;
    }

    public int getHomeGoalsForHT() {
        return homeGoalsForHT;
    }

    public int getHomeGoalsAgainstHT() {
        return homeGoalsAgainstHT;
    }

    public int getAwayGoalsForHT() {
        return awayGoalsForHT;
    }

    public int getAwayGoalsAgainstHT() {
        return awayGoalsAgainstHT;
    }

    public int getPoints() {
        return (((homeWin + awayWin) * 3) + ((homeDraw + awayDraw)));
    }

    public int getPointsHT() {
        return (((homeWinHT + awayWinHT) * 3) + ((homeDrawHT + awayDrawHT)));
    }

    public int getGoalDifference() {
        return ((homeGoalsFor + awayGoalsFor) - (homeGoalsAgainst + awayGoalsAgainst));
    }

    public int getHomeGoalDifference() {
        return (homeGoalsFor - homeGoalsAgainst);
    }

    public int getAwayGoalDifference() {
        return (awayGoalsFor - awayGoalsAgainst);
    }

    public int getTotalGoalsFor() {
        return homeGoalsFor + awayGoalsFor;
    }

    public int getTotalGoalsAgainst() {
        return homeGoalsAgainst + awayGoalsAgainst;
    }

    public int getTotalMatchesPlayed(){return matchesPlayedHome+matchesPlayedAway;}

    public int getGoalDifferenceHT() {
        return ((homeGoalsForHT + awayGoalsForHT) - (homeGoalsAgainstHT + awayGoalsAgainstHT));
    }

    public int getHomeGoalDifferenceHT() {
        return (homeGoalsForHT - homeGoalsAgainstHT);
    }

    public int getAwayGoalDifferenceHT() {
        return (awayGoalsForHT - awayGoalsAgainstHT);
    }

    public int getTotalGoalsForHT() {
        return homeGoalsForHT + awayGoalsForHT;
    }

    public int getTotalGoalsAgainstHT() {
        return homeGoalsAgainstHT + awayGoalsAgainstHT;
    }

    public int getTotalMatchesPlayedHT(){return matchesPlayedHomeHT+matchesPlayedAwayHT;}



    @Override
    public String toString() {
        return "Nome:'" + name + "\n" +
                "Partidas Jogadas: "+ getTotalMatchesPlayed()+"\n"+
                "\n"+
                "Jogos em Casa \n"+
                "Vit�rias: "+homeWin+"\n"+
                "Empates: "+homeDraw+"\n"+
                "Derrotas: "+homeLose+"\n"+
                "Gols pr�: "+homeGoalsFor+"\n"+
                "Gols Contra: "+homeGoalsAgainst+"\n"+
                "\n"+
                "Jogos Fora \n"+
                "Vit�rias: "+awayWin+"\n"+
                "Empates: "+awayDraw+"\n"+
                "Derrotas: "+awayLose+"\n"+
                "Gols Pr�: "+awayGoalsFor+"\n"+
                "Gols Contra: "+awayGoalsAgainst+"\n"+
                "\n"+
                "Total \n"+
                "Gols Pr�:"+getTotalGoalsFor()+"\n"+
                "Goal Contra:"+getTotalGoalsAgainst()+"\n"+
                "Saldo de Gols: "+getGoalDifference()+"\n"+
                "Pontos: "+getPoints();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        return name != null ? name.equals(team.name) : team.name == null;

    }


    public int hashCode() {
        int hash = 0;
        for (int i = 1; i < name.length(); i++){
            hash = 3*hash+name.charAt(i);
        }
        return hash;
    }


}