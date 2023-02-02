package competition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



import competition.util.Strategy;

public class Master extends Competition {
	private Strategy strat;
	private int groups;
	public Master(List<Competitor> competitors, Match match, Strategy strat,int groups){
        super(competitors,match);
        this.strat = strat;
        this.groups= groups;
	}
	
	@Override
	protected void play(List<Competitor> competitors) {
		
		List<Competitor> copy = this.createCopy(competitors);
		List<Competitor> finalc= this.poolPhase(copy);
		System.out.println("\n*************** Finals ***************\n");
		
		this.setToZero(finalc);
		Match match = new MatchRandom();
		Competition finals = new Tournament (finalc, match);
		finals.play(finalc);
		
		
	}
	
	/** A getter for the used strategy
	 * @return The strategy used 
	 */
	public Strategy getStrat() {
		return this.strat;
	}
	
	/** A method the plays the pool phase
	 * @param competitors The list of the competitors
	 * @return the list of the winners of the pool phase (the competitors who will participate in the next phase) 
	 */
	public List<Competitor> poolPhase (List<Competitor> competitors){
		List<List<Competitor>>comps = this.cutToGroups(competitors);
		List<League> leagues = new ArrayList<League>();
		List<Map<Competitor, Integer>> rank = new ArrayList<Map<Competitor, Integer>>();
		for(List<Competitor> l: comps) {
			leagues.add(new League(l, new MatchRandom()));
		}
		for(League l : leagues) {
			l.play();
			rank.add(l.ranking());
		}
		List<Competitor> res = this.getStrat().chooseWinners(rank);
		System.out.println(res);
		
		return res;
	}
	
	
	/** Cuts the list of the competitors into groups for the pool phase
	 * @param comps The list of the competitors
	 * @return a list of groups 
	 */
	public List<List<Competitor>> cutToGroups(List<Competitor> comps){
		int t = comps.size()%this.getGroups();
		if(t !=0) {
			return null;
		}
		int nb=  comps.size()/this.getGroups();
		List<List<Competitor>> res = new ArrayList<List<Competitor>>();
		/*
		for(int i =0; i<this.getGroups(); i++) {
			res.add(new ArrayList<Competitor>());
		}
		int j = 0;
		for(Competitor c : comps) {
			for(List<Competitor> l : res) {
				while (j<nb) {
					l.add(c);
					j++;
				}
				j=0;
			}
		}*/
		Iterator<Competitor> it = comps.iterator();
		for(int i=0; i<this.getGroups(); i++) {
			List<Competitor> l= new ArrayList<Competitor>();
			int j=0;
			while(j<nb) {
				if(it.hasNext()) {
					l.add(it.next());
				}
				j++;
			}
			res.add(l);
		}
		
		return res;
		
		
	}
	
	

	public int getGroups() {
		return groups;
	}
	

}
