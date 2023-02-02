package competition.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import competition.Competitor;

/** Class that builds random strategies to generate a random number of chosen winners */
public class RandomStrategy implements Strategy {

	/** A random generator used to generate random actions for bot players.
	 * 
	 */
	private static Random generator = new Random();
	private int n; 
	private int size;
	
	public RandomStrategy(int size) {
		this.size=size;
		int res = generator.nextInt(size);
		if (res <= size -1) {
			this.n=res;
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


	public int getSize() {
		return this.size;
	}
}
