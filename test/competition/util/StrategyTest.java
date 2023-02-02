package competition.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import competition.BookMaker;
import competition.Competition;
import competition.Competitor;
import competition.Journalist;
import competition.League;
import competition.Match;
import competition.MatchRandom;
import competition.Observer;

class StrategyTest {
	
	private Competitor c1, c2, c3, c4, c5, c6, c7 ,c8;
	private Competition comp1,comp2;
	private Match match;
	private List<Observer> lo1;
	private List<Observer> lo2;
	private Strategy strat;
	private List<Map<Competitor, Integer>> l ;
	
	public void init() {
		this.l = new ArrayList<Map<Competitor,Integer>>();
		
		List<Competitor> l1 = new ArrayList<Competitor>();
		
		this.c1= new Competitor("Gildas");
        this.c2= new Competitor("Sabine");
        this.c3= new Competitor("Richard");
        this.c4= new Competitor("Alexendre");
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        
        List<Competitor> l2 = new ArrayList<Competitor>();
        this.c5= new Competitor("ilyas");
        this.c6= new Competitor("nadine");
        this.c7= new Competitor("hicham");
        this.c8= new Competitor("ganech");
        l2.add(c5);
        l2.add(c6);
        l2.add(c7);
        l2.add(c8);
		
		this.match =new MatchRandom();
		
		this.lo1 = new ArrayList<Observer>();
        Observer journalist = new Journalist("Dupont");
        Observer bookmaker = new BookMaker ("PMU",l1);
        Observer bookmaker2 = new BookMaker("parionsSport",l2);
        
        lo1.add(journalist);
        lo2.add(journalist);
        lo1.add(bookmaker);
        lo2.add(bookmaker2);
		
		this.comp1 = new League(l1, match,lo1);
		this.comp2 = new League(l2, match,lo2);
		
		this.comp1.play();
		this.comp2.play();
		
		Map<Competitor,Integer> m1= this.comp1.ranking();
        Map<Competitor,Integer> m2= this.comp2.ranking();
        
        l.add(m1);
        l.add(m2);
        
        this.strat= new BasicStrategy();
        
	}
	
	@Test
	public void chooseWinnersTest() {
		this.init();
		List<Competitor> res=this.strat.chooseWinners(this.l);
		assertSame(4, res.size());
		
	}

}
