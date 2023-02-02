package competition;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

import org.junit.jupiter.api.Test;

public class LeagueTest extends CompetitionTest{
    protected Competition createCompetition(List<Competitor> list, Match match, List<Observer> ob){
        return new League(list,match,ob);
    }
    @Test
    public void playTest() {
    	this.init();
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
