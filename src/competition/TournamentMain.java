package competition;



import java.util.List;
import java.util.Observer;
import java.util.ArrayList;

//Tournament main
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
        

        @SuppressWarnings("deprecation")
		List<Observer> lo = new ArrayList<Observer> ();
        Observer journalist = new Journalist("Dupont");
        Observer bookmaker = new BookMaker ("PMU",comp);
        lo.add(journalist);
        lo.add(bookmaker);
        Tournament t = new Tournament (comp, match,lo);
        //t.addObserver(journalist);
        
        //match.addObserver(journalist);
       //match.addObserver(bookmaker);
      

        t.play();


	}

}
