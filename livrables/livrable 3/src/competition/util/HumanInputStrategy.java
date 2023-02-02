package competition.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import competition.util.io.Input;
import competition.Competitor;

/** Class that builds strategies that allow humans to provide the number of winners we need to choose per group with keyboard input */
public class HumanInputStrategy implements Strategy {
	
	private int size;
	private int n; 
	
	public HumanInputStrategy(int size) {
		this.size=size;
		String user=Input.readString();
		int res = Integer.parseInt(user);
		if (res<= size-1) {
			this.n= res;
		}
	}
	
	@Override
	public List<Competitor> chooseWinners(List<Map<Competitor, Integer>> group) {
		List<Competitor> list = new ArrayList<Competitor>();
		for (Map<Competitor, Integer> m : group) {
			Set<Competitor> keys = m.keySet();
			Iterator<Competitor> it = keys.iterator();
			int i = 0;
			while(i<this.getN()) {
				list.add(it.next());
				i++;
			}
			i=0;
			
		}
		return list;
	}	

	public int getN() {
		return this.n;
	}

}
