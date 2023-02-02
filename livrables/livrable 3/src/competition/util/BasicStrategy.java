package competition.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import competition.Competitor;

/** Class that builds basic strategies that generate choose the first 2 in the ranking from each group */
public class BasicStrategy implements Strategy {
	
	public BasicStrategy() {
	}

	@Override
	public List<Competitor> chooseWinners(List<Map<Competitor, Integer>> group) {
		List<Competitor> list = new ArrayList<Competitor>();
		for (Map<Competitor, Integer> m : group) {
			Set<Competitor> keys = m.keySet();
			Iterator<Competitor> it = keys.iterator();
			int i = 0;
			while(i<2) {
				list.add(it.next());
				i++;
			}
			i=0;
			
		}
		return list;
	}	

}
