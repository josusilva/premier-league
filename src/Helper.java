package code;
/**
 *  Nós (Giordano Trombetta, Josué Silva, Fabio Junqueira), garantimos que:
 *  - Não utilizamos código fonte obtidos de outros estudantes,
 *    ou fonte não autorizada, seja modificado ou cópia literal.
 *  - Todo código usado em nosso trabalho é resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    código publicado nos livros texto desta disciplina.
 *  - Temos total ciência das consequências em caso de violarmos estes termos.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Helper {

	private String filePath = "C:/Users/giordano.trombetta/Desktop/";
			
	public void writeBestTeams(Team[] teams, String fileName){
		try {
			File file = new File(filePath + fileName + ".txt");
			// 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(String.format("%-31s %-20s %-37s %-48s %n",
			" ", "- Home -", " - Away -", " - Total -"
			));
			
			bw.write(String.format("%-3s %-22s %-4s %-4s %-4s %-7s %-4s %-4s %-4s %-7s %-7s %-8s %-7s %-7s %n", 
			" ", " ", "Pld", "W", "D", "L", "F:A    ", "W", "D", "L", "F:A     ", "   F:A  ", "   +/-", "  Pts"));			
			int count = 1;
			for (int i = teams.length - 1; i >= 0; i --) {
				Team team = teams[i];
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
				" " + (team.getTotalGoalsFor() - team.getTotalGoalsAgainst()),
				"   "+team.getPoints()
				));	
				count++;
			}
			
			
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeBestTeamsHT(Team[] teams, String fileName){
		try {
			File file = new File(filePath + fileName + ".txt");
			// 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(String.format("%-31s %-20s %-37s %-48s %n",
			" ", "- Home -", " - Away -", " - Total -"
			));
			
			bw.write(String.format("%-3s %-22s %-4s %-4s %-4s %-7s %-4s %-4s %-4s %-7s %-7s %-8s %-7s %-7s %n", 
			" ", " ", "Pld", "W", "D", "L", "F:A    ", "W", "D", "L", "F:A     ", "   F:A  ", "   +/-", "  Pts"));			
			int count = 1;
			for (int i = teams.length - 1; i >= 0; i --) {
				Team team = teams[i];
				bw.write(String.format("%-3s %-22s %-4s %-4s %-4s %-7s %-4s %-4s %-4s %-7s %-7s %-5s %-4s %-7s %n", 
				count, 
				team.getName(),
				team.getTotalMatchesPlayedHT(),
				team.getHomeWinHT(),
				team.getHomeDrawHT(),
				team.getHomeLoseHT(),
				team.getHomeGoalsForHT() +":"+team.getHomeGoalsAgainstHT()+"  ",
				team.getAwayWinHT(),
				team.getAwayDrawHT(),
				team.getAwayLoseHT(),
				team.getAwayGoalsForHT() +":"+team.getAwayGoalsAgainstHT() +"   ",
				"   "+team.getTotalGoalsForHT() +":"+team.getTotalGoalsAgainstHT()+"  ",
				" " + (team.getTotalGoalsForHT() - team.getTotalGoalsAgainstHT()),
				"   "+team.getPointsHT()
				));	
				count++;
			}
			
			
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeTopScorer(Team team, String fileName){
		try {
			File file = new File(filePath + fileName + ".txt");
			// 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(String.format("%-12s %-2s %-5s %n", 
			team.getName(), ", ", team.getTotalGoalsFor()));			
					
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeLessDefeats(Team team, String fileName){
		try {
			File file = new File(filePath + fileName + ".txt");
			// 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(String.format("%-12s %-2s %-5s %n", 
			team.getName(), ", ", team.getTotalLosses()));			
					
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeBestStrikers(Team[] teams, String fileName){
		try {
			File file = new File(filePath + fileName + ".txt");
			// 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Team team : teams){
				bw.write(String.format("%-23s %-2s %-15s %n", 
				team.getName(), ", ", team.getGoalsPerShoots() + " chutes a gol para cada gol"));
			}						
					
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}