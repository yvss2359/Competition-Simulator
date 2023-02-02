package competition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import competition.util.BasicStrategy;
import competition.util.Strategy;

class MasterTest extends CompetitionTest {
	private Strategy strat = new BasicStrategy();
	private int groups = 2;
	private Master cmp;
	private Competitor c5, c6, c7, c8;
	protected Master createCompetition(List<Competitor> list, Match match) {
		return new Master(list,match, strat, groups);
	}
	
	
	public void init1(){
		this.c5= new Competitor("ilyas");
        this.c6= new Competitor("nadine");
        this.c7= new Competitor("hicham");
        this.c8= new Competitor("ganech");
        
        this.l.add(4,this.c5);
        this.l.add(5,this.c6);
        this.l.add(6,this.c7);
        this.l.add(7,this.c8);
        
        this.cmp= createCompetition(l,m);
      
    }
	@Test
	public void cutToGroupsTest() {
		this.init();
		this.init1();
		List<List<Competitor>> res = this.cmp.cutToGroups(l);
		assertEquals(this.groups,res.size());
		for(List<Competitor> g : res) {
			assertEquals(4, g.size());
		}
	}
	
	@Test
	public void poolPhaseTest() {
		this.init();
		this.init1();
		List<Competitor> res = this.cmp.poolPhase(l);
		assertSame(4, res.size());
		List<List<Competitor>> g = this.cmp.cutToGroups(l);
		for(Competitor c : res) {
			assertTrue(g.get(0).contains(c) || g.get(1).contains(c));
		}
		
		
		
	}
	
	@Test
	public void playTest() {
		this.init();
		this.init1();
		this.cmp.play();
			
			int points_max = 0;
			for (int i : this.cmp.ranking().values()) {
				if(i > points_max) {
					points_max = i;
				}
			}
			assertEquals(points_max,this.cmp.winner().getPoints());
	}
	
	
	
	

}
