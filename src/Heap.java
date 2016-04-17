package code;
/**
 *  Nós (Giordano Trombetta, Josué Silva, Fabio Junqueira), garantimos que: 
 */
import java.util.Arrays;

public class Heap {
	
	public Team[] HeapSort(Team[] teams){		
		int i;
		int n = teams.length;
		Team aux;		
		for(i = ((n-1)/2); i >= 0; i--){
			teams = CreateHeap(teams, i, n-1);
		}
		for (i = n -1; i >= 1; i--){
			aux = teams[0];
			teams[0] = teams[i];
			teams[i] = aux;
			teams = CreateHeap(teams, 0, i-1);
		}
		return teams;
	}

	public Team[] CreateHeap(Team[] teams, int start, int end){
		Team aux = teams[start];
		int j = start * 2 + 1;
		
		while(j <= end){
			if(j < end){
				if(teams[j].getPoints() < teams[j + 1].getPoints()){
					j = j + 1;
				}
			}
			if(aux.getPoints() < teams[j].getPoints()){
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
