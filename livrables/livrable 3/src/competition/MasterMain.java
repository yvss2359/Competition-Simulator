package competition;


import java.util.ArrayList;
import java.util.List;

import competition.util.BasicStrategy;
import competition.util.HumanInputStrategy;
import competition.util.RandomStrategy;
import competition.util.Strategy;

//Master Main
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
	      
	      Match match  = new MatchRandom();
	      Strategy s = new BasicStrategy();
	     
	 
	        

	        List<Observer> lo = new ArrayList<Observer> ();
	        Observer journalist = new Journalist("Dupont");
	        Observer bookmaker = new BookMaker ("PMU",comp);
	        lo.add(journalist);
	        lo.add(bookmaker);
	        //t.addObserver(journalist);
	        Master m = new Master(comp, match,lo, s, 2);
	        //match.addObserver(journalist);
	        //match.addObserver(bookmaker);
	      

	        
	      
	     
	      m.play();
	}

}
