package competition;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public  class MatchRandomTest {

    protected Match myMatch;
    protected Competitor c1, c2;

    public void init() {
        myMatch = new MatchRandom();
        c1 = new Competitor("Gildas");
        c2 = new Competitor("Nadine");
    }
    @Test
    public void winMatchTest(){
    	this.init();
    	Object o = this.myMatch.winMatch(this.c1,this.c2);
        assertTrue(o instanceof Competitor);
        Competitor winner =  this.myMatch.winMatch(this.c1,this.c2);
        assertTrue(this.c1.equals(winner) || this.c2.equals(winner));
        
    }


}