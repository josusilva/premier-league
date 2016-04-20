

import java.util.Comparator;

/**
 *  N�s (Giordano Trombetta, Josu� Silva, Fabio Junqueira), garantimos que:
 *  - N�o utilizamos c�digo fonte obtidos de outros estudantes,
 *    ou fonte n�o autorizada, seja modificado ou c�pia literal.
 *  - Todo c�digo usado em nosso trabalho � resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    c�digo publicado nos livros texto desta disciplina.
 *  - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.
 */

public class Heap {
	
	public <T extends Comparable<T>> Team[] heapSort(Team[] teams, Comparator<Team> comparable){		
		int i;
		int n = teams.length;
		Team aux;		
		for(i = ((n-1)/2); i >= 0; i--){
			teams = createHeap(teams, i, n-1, comparable);
		}
		for (i = n -1; i >= 1; i--){
			aux = teams[0];
			teams[0] = teams[i];
			teams[i] = aux;
			teams = createHeap(teams, 0, i-1, comparable);
		}
		return teams;
	}

	public Team[] createHeap(Team[] teams, int start, int end, Comparator<Team> comparable ){
		Team aux = teams[start];
		int j = start * 2 + 1;
				
		while(j <= end){
			if(j < end){
				if(comparable.compare(teams[j], teams[j + 1]) == -1){
					j = j + 1;
				}
			}
			if(comparable.compare(aux,teams[j]) == -1){
				teams[start] = teams[j];
				start = j;
				j = 2 * start + 1;
			}
			else{
				j = end + 1;
			}
		}
		teams [start] = aux;		
		
		return teams;
	}
}
