package competition;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompetitorTest {
	Competitor c= new Competitor("Gildas");

	@Test
    public void addPointTest(){
        assertEquals(0,this.c.getPoints());
        this.c.addPoint();
        assertEquals(1,this.c.getPoints());
    }
}