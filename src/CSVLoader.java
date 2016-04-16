import javax.swing.*;
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
                int homeWinHT=0;
                int awayWinHT=0;
                int homeDrawHT=0;
                int awayDrawHT=0;
                int homeLoseHT=0;
                int awayLoseHT=0;
                int homeGoalsForHT=0;
                int homeGoalsAgainstHT=0;
                int awayGoalsForHT=0;
                int awayGoalsAgainstHT=0;
                int homeShoots=0;
                int awayShoots=0;
                result = line.split(",");
                Team homeTeam = new Team(result[2]);
                Team awayTeam = new Team(result[3]);
                //RESULTADO FINAL
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
                //PRIMEIRO TEMO
                if (result[9].charAt(0)=='H'){
                    //home
                    homeWinHT++;
                    homeGoalsForHT = Integer.valueOf(result[7]);
                    homeGoalsAgainstHT = Integer.valueOf(result[8]);
                    //away
                    awayLoseHT++;
                    awayGoalsForHT = Integer.valueOf(result[8]);
                    awayGoalsAgainstHT = Integer.valueOf(result[7]);
                } else if (result[9].charAt(0)=='A'){
                    //home
                    homeLoseHT++;
                    homeGoalsForHT = Integer.valueOf(result[7]);
                    homeGoalsAgainstHT = Integer.valueOf(result[8]);
                    //away
                    awayWinHT++;
                    awayGoalsForHT = Integer.valueOf(result[8]);
                    awayGoalsAgainstHT = Integer.valueOf(result[7]);
                } else{
                    //home
                    homeDrawHT++;
                    homeGoalsForHT = Integer.valueOf(result[7]);
                    homeGoalsAgainstHT = Integer.valueOf(result[8]);
                    //away
                    awayDrawHT++;
                    awayGoalsForHT = Integer.valueOf(result[8]);
                    awayGoalsAgainstHT = Integer.valueOf(result[7]);
                }

                Team h = hash.find(homeTeam.hashCode(),homeTeam);
                if (h==null){
                    homeTeam.addHomeStats(homeWin, homeDraw, homeLose, homeGoalsFor, homeGoalsAgainst, homeShoots);
                    homeTeam.addHomeStatsHT(homeWinHT, homeDrawHT, homeLoseHT, homeGoalsForHT, homeGoalsAgainstHT);
                    hash.addKey(homeTeam.hashCode(), homeTeam);
                } else{
                    hash.find(homeTeam.hashCode(),homeTeam).addHomeStats(homeWin, homeDraw, homeLose, homeGoalsFor, homeGoalsAgainst, homeShoots);
                    hash.find(homeTeam.hashCode(), homeTeam).addHomeStatsHT(homeWinHT, homeDrawHT, homeLoseHT, homeGoalsForHT, homeGoalsAgainstHT);
                }
                Team a = hash.find(awayTeam.hashCode(), awayTeam);
                if (a==null){
                    awayTeam.addAwayStats(awayWin, awayDraw, awayLose, awayGoalsFor, awayGoalsAgainst, awayShoots);
                    awayTeam.addAwayStatsHT(awayWinHT, awayDrawHT, awayLoseHT, awayGoalsForHT, awayGoalsAgainstHT);
                    hash.addKey(awayTeam.hashCode(), awayTeam);
                } else{
                    hash.find(awayTeam.hashCode(), awayTeam).addAwayStats(awayWin, awayDraw, awayLose, awayGoalsFor, awayGoalsAgainst, awayShoots);
                    hash.find(awayTeam.hashCode(), awayTeam).addAwayStatsHT(awayWinHT, awayDrawHT, awayLoseHT, awayGoalsForHT, awayGoalsAgainstHT);
                }
                i++;
                line = br.readLine();
            }
            br.close();

        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Formato de Arquivo Inválido", "Premier League", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
