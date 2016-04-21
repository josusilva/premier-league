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
import java.util.Comparator;

public class HTPointsComparator implements Comparator<Team> {
	
	@Override
	public int compare (Team a, Team b){
		return a.getPointsHT() < b.getPointsHT() ? -1 : a.getPointsHT() == b.getPointsHT() ? 0 : 1;
	}

}