package competition;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public  class MatchRandomTest {

    protected Match myMatch;
    protected Competitor c1, c2;
    protected Journalist j;
  

    public void init() {
        myMatch = new MatchRandom();
        c1 = new Competitor("Gildas");
        c2 = new Competitor("Nadine");
    }
    @Test
    public void winMatchTest(){
    	this.init();
        
        this.myMatch.winMatch(c1,c2);
        Competitor winner =  this.myMatch.getWinner();
        assertTrue(winner instanceof Competitor);
        assertTrue(this.c1.equals(winner) || this.c2.equals(winner));
        
    }
    
    @Test
    public void addObserverTest() {
    	assertEquals(0,this.myMatch.observers.size());
    	this.myMatch.addObserver(j);
    	assertEquals(1,this.myMatch.observers.size());
    	assertEquals(j,this.myMatch.observers.get(0));
    }
    public void removeObserverTest() {
    	assertEquals(1,this.myMatch.observers.size());
    	this.myMatch.removeObserver(j);
    	assertEquals(0,this.myMatch.observers.size());
    }


}