package code;
/**
 *  N�s (Giordano Trombetta, Josu� Silva, Fabio Junqueira), garantimos que:
 *  - N�o utilizamos c�digo fonte obtidos de outros estudantes,
 *    ou fonte n�o autorizada, seja modificado ou c�pia literal.
 *  - Todo c�digo usado em nosso trabalho � resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    c�digo publicado nos livros texto desta disciplina.
 *  - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.
 */
import java.util.Comparator;

public class PointsComparator implements Comparator<Team> {
	
	@Override
	public int compare (Team a, Team b){
		if (a.getPoints() < b.getPoints()){
			return -1;
		} else if(a.getPoints()== b.getPoints()) {
			if (a.getGoalDifference() == b.getGoalDifference()) {
				if (a.getTotalGoalsFor() < b.getTotalGoalsFor()) {
					return -1;
				}else {
					return 1;
				}
			}else if (a.getGoalDifference() < b.getGoalDifference()){
				return -1;
			}else{
				return 1;

			}

		} else{
			return 1;
		}
	}

}
