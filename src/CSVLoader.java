import java.util.ArrayList;

/**
 * Created by josue on 06/04/16.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CSVLoader {



    public CSVLoader() {
    }

    public void loadCSV(String filePath, Hash<Team> hash){
        try{
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String result[] = line.split(",");
            line = br.readLine();
            int i = 1;
            String temp = "";
            while (line != null){
                int homeWin=0;
                int awayWin=0;
                int homeDraw=0;
                int awayDraw=0;
                int homeLose=0;
                int awayLose=0;
                int homeGoalsFor=0;
                int homeGoalsAgainst=0;
                int awayGoalsFor=0;
                int awayGoalsAgainst=0;
                int homeShoots=0;
                int awayShoots=0;
                result = line.split(",");
                Team homeTeam = new Team(result[2]);
                Team awayTeam = new Team(result[3]);
                if (result[6].charAt(0)=='H'){
                    //home
                    homeWin++;
                    homeGoalsFor = Integer.valueOf(result[4]);
                    homeGoalsAgainst = Integer.valueOf(result[5]);
                    homeShoots = Integer.valueOf(result[11]);
                    //away
                    awayLose++;
                    awayGoalsFor = Integer.valueOf(result[5]);
                    awayGoalsAgainst = Integer.valueOf(result[4]);
                    awayShoots = Integer.valueOf(result[12]);
                } else if (result[6].charAt(0)=='A'){
                    //home
                    homeLose++;
                    homeGoalsFor = Integer.valueOf(result[4]);
                    homeGoalsAgainst = Integer.valueOf(result[5]);
                    homeShoots = Integer.valueOf(result[11]);
                    //away
                    awayWin++;
                    awayGoalsFor = Integer.valueOf(result[5]);
                    awayGoalsAgainst = Integer.valueOf(result[4]);
                    awayShoots = Integer.valueOf(result[12]);
                } else{
                    //home
                    homeDraw++;
                    homeGoalsFor = Integer.valueOf(result[4]);
                    homeGoalsAgainst = Integer.valueOf(result[5]);
                    homeShoots = Integer.valueOf(result[11]);
                    //away
                    awayDraw++;
                    awayGoalsFor = Integer.valueOf(result[5]);
                    awayGoalsAgainst = Integer.valueOf(result[4]);
                    awayShoots = Integer.valueOf(result[12]);
                }
                if (hash.find(homeTeam)==null){
                    homeTeam.addHomeStats(homeWin, homeDraw, homeLose, homeGoalsFor, homeGoalsAgainst, homeShoots);
                    hash.addKey(homeTeam);
                } else{
                    hash.find(homeTeam).addHomeStats(homeWin, homeDraw, homeLose, homeGoalsFor, homeGoalsAgainst, homeShoots);
                }
                if (hash.find(awayTeam)==null){
                    awayTeam.addAwayStats(awayWin, awayDraw, awayLose, awayGoalsFor, awayGoalsAgainst, awayShoots);
                    hash.addKey(awayTeam);
                } else{
                    hash.find(awayTeam).addAwayStats(awayWin, awayDraw, awayLose, awayGoalsFor, awayGoalsAgainst, awayShoots);
                }
                i++;
                line = br.readLine();
            }
            br.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
