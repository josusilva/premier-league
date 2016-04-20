package code;

import java.util.Comparator;

/**
 *  Nós (Giordano Trombetta, Josué Silva, Fabio Junqueira), garantimos que:
 *  - Não utilizamos código fonte obtidos de outros estudantes,
 *    ou fonte não autorizada, seja modificado ou cópia literal.
 *  - Todo código usado em nosso trabalho é resultado do nosso
 *    trabalho original, ou foi derivado de um
 *    código publicado nos livros texto desta disciplina.
 *  - Temos total ciência das consequências em caso de violarmos estes termos.
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
