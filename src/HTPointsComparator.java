
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

public class HTPointsComparator implements Comparator<Team> {
	
	@Override
	public int compare (Team a, Team b){
		return a.getPointsHT() < b.getPointsHT() ? -1 : a.getPointsHT() == b.getPointsHT() ? 0 : 1;
	}

}