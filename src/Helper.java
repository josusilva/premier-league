package code;
/**
 *  Nós (Giordano Trombetta, Josué Silva, Fabio Junqueira), garantimos que: 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Helper {

	public void Writer(Team[] teams, String fileName){
		try {
			File file = new File("C:/Users/Giordano/Desktop/"+fileName+".txt");
			// 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(String.format("%-3s %-22s %-4s %-4s %-4s %-7s %-4s %-4s %-4s %-7s %-7s %-8s %-5s %-7s %n", 
			" ", " ", "Pld", "W", "D", "L", "F:A    ", "W", "D", "L", "F:A     ", "   F:A  ", "+/-", "Pts"));			
			int count = 1;
			for (Team team : teams) {
				bw.write(String.format("%-3s %-22s %-4s %-4s %-4s %-7s %-4s %-4s %-4s %-7s %-7s %-5s %-4s %-7s %n", 
				count, 
				team.getName(),
				team.getMatchesPlayed(),
				team.getHomeWin(),
				team.getHomeDraw(),
				team.getHomeLose(),
				team.getHomeGoalsFor() +":"+team.getHomeGoalsAgainst()+"  ",
				team.getAwayWin(),
				team.getAwayDraw(),
				team.getAwayLose(),
				team.getAwayGoalsFor() +":"+team.getAwayGoalsAgainst() +"   ",
				"   "+team.getTotalGoalsFor() +":"+team.getTotalGoalsAgainst()+"  ",
				(team.getTotalGoalsFor() - team.getTotalGoalsAgainst()),
				team.getPoints()
				));	
				count++;
			}
			
			
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}