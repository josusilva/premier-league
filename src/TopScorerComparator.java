

import java.util.Comparator;

public class TopScorerComparator implements Comparator<Team> {
	
	@Override
	public int compare (Team a, Team b){
		return a.getTotalGoalsFor() < b.getTotalGoalsFor() ? -1 : a.getTotalGoalsFor() == b.getTotalGoalsFor() ? 0 : 1;
	}

}