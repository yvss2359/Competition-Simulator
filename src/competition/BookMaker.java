package competition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// A bookmaker takes bets, calculates odds and pays out winnings 
public class BookMaker implements Observer {
	private String name;
	private static  Map <Competitor, Integer> odds;
	
	//Bookmaker constructor
	public BookMaker(String nom, List<Competitor> competitors) {
		this.name = nom;
		this.odds= new HashMap<Competitor, Integer>();
		this.setAllDefault(competitors);
	}
	
	/**Gets the name of the bookmaker 
	 * @return the name of the bookmaker**/
	public String getName() {
		return this.name;
	}
	
	//Gets the odds
	public Map <Competitor, Integer> getOdds(){
		return this.odds;
	}
	
	//Empties the hashmap of odds 
	public void removeAll() {
		for(Competitor c : this.getOdds().keySet()) {
			this.odds.remove(c);
		}
	}
	
	/** sets the odds for each competitor to 1 
	 *@param competitors the list of competitors
	 **/
	public void setAllDefault(List<Competitor> competitors) {
		for (Competitor c:competitors) {
			this.getOdds().put(c, 1);
		}
		System.out.println(this.getOdds());
	}
	
	@Override
	public void reactToMatch( Match match) {
		
		Competitor c1 = match.getFirst();
		Competitor c2 = match.getSecond();
		
		
		
		if(c1.equals(match.getLoser())) {
			int res = this.getOdds().get(c1);
			res++;
			this.getOdds().replace(c1, res);
		}
		
		if(c1.equals(match.getWinner())) {
			
			int res = this.getOdds().get(c1);
			if(res > 1) {
				res--;
				this.getOdds().replace(c1, res);
			}
		}
		
		if(c2.equals(match.getLoser())) {
			int res = this.getOdds().get(c2);
			res++;
			this.getOdds().replace(c2, res);
		}
		if(c2.equals(match.getWinner())) {
			int res = this.getOdds().get(c2);
			if(res > 1) {
				res--;
				this.getOdds().replace(c2, res);
			}
		}
		
		
		
	 System.out.println(this.getName()+ " :\" the odds are : "+ c1.getName()+ " has "+ this.getOdds().get(c1)+ "  &  "+c2.getName()+ " has " + this.getOdds().get(c2)+"\"\n");
		
		
	}
	
	
	
}
