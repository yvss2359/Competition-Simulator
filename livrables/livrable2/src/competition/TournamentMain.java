package competition;


import java.util.List;
import java.util.ArrayList;


public class TournamentMain {

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
        Tournament t = new Tournament(comp, match);

        t.play();

	}

}
