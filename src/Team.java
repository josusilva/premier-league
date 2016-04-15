/**
 * Created by josue on 09/04/16.
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

    public String getName() {
        return name;
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

    public int getPoints() {
        return (((homeWin + awayWin) * 3) + ((homeDraw + awayDraw)));
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

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", matchesPlayedHome=" + matchesPlayedHome +
                ", matchesPlayedAway=" + matchesPlayedAway +
                ", homeWin=" + homeWin +
                ", awayWin=" + awayWin +
                ", homeDraw=" + homeDraw +
                ", awayDraw=" + awayDraw +
                ", homeLose=" + homeLose +
                ", awayLose=" + awayLose +
                ", homeGoalsFor=" + homeGoalsFor +
                ", homeGoalsAgainst=" + homeGoalsAgainst +
                ", awayGoalsFor=" + awayGoalsFor +
                ", awayGoalsAgainst=" + awayGoalsAgainst +
                ", Total Points" + getPoints() +
                '}';
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
            hash = hash+name.charAt(i);
        }
        return hash;
    }
}