package competition;

import java.util.ArrayList;
import java.util.List;

import competition.util.BasicStrategy;
import competition.util.HumanInputStrategy;
import competition.util.RandomStrategy;
import competition.util.Strategy;

public class MasterMain {
	public static void main(String[] args) {
		List<Competitor> comp = new ArrayList<Competitor>();
		  comp.add(new Competitor("Gildas"));
	      comp.add(new Competitor("Sabine"));
	      comp.add(new Competitor("Alex"));
	      comp.add(new Competitor("Richard"));

	      comp.add(new Competitor("ilyas"));
	      comp.add(new Competitor("nadine"));
	      comp.add(new Competitor("py"));
	      comp.add(new Competitor("hicham"));
	      
	      Match match = new MatchRandom();
	      Strategy s = new HumanInputStrategy(4);
	      Master m = new Master(comp, match, s, 2);
	      m.play();
	}

}
