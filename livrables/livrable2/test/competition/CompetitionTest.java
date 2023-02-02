package competition;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import java.util.*;

public abstract class CompetitionTest{
    protected Competition cmp;
    protected Competitor c1, c2, c3, c4, p1, p2;
    protected List<Competitor> l;
    protected Match m;
    protected abstract Competition createCompetition(List<Competitor> list, Match match);
    
    public void init(){
    
        this.c1= new Competitor("Gildas");
        this.c2= new Competitor("Sabine");
        this.c3= new Competitor("Richard");
        this.c4= new Competitor("Alexendre");

        this.p1 = new Competitor("Reiner");
        this.p2 = new Competitor("Eren");

        this.l = new ArrayList<Competitor>();
        this.m = new MatchRandom();
        assertEquals(0,this.p1.getPoints());
        

        this.l.add(0,this.c1);
        this.l.add(1,this.c2);
        this.l.add(2,this.c3);
        this.l.add(3,this.c4);
        this.cmp= createCompetition(l,m);
      
    }
    @Test 
    public void RankingTest(){
    	this.init();
    	assertEquals(0,this.c1.getPoints());
        assertEquals(0,this.c2.getPoints());
        assertEquals(0,this.c3.getPoints());
        assertEquals(0,this.c4.getPoints());
        this.l.get(2).addPoint();
        this.l.get(2).addPoint();
        this.l.get(2).addPoint();
        this.l.get(1).addPoint();
        this.l.get(1).addPoint();
        this.l.get(0).addPoint();
        assertEquals(4,this.cmp.ranking().size());
        assertSame(3,this.cmp.ranking().get(this.c3));
        assertSame(2,this.cmp.ranking().get(this.c2));
        assertSame(1,this.cmp.ranking().get(this.c1));
        assertSame(0,this.cmp.ranking().get(this.c4));
        
    }

    @Test
    public void playMatchTest(){
    	this.init();
        assertEquals(0, this.p1.getPoints());
        assertEquals(0, this.p2.getPoints());
        this.cmp.playMatch(p1,p2);
        assertTrue(1 == this.p1.getPoints() || 1== this.p2.getPoints());

    }
}