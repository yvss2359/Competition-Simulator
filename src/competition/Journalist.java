package competition;

// Journalists attend competitions and share the matches results
public class Journalist implements Observer {
	private String name;
	private Competition comp;
	//Journalist constructor
	public Journalist(String nom) {
		this.name = nom;
		this.comp=comp;
	}
	
	/**Gets the name of the journalist 
	 * @return the name of the journalist**/
	public String getName() {
		return this.name;
	}
	@Override
	public void reactToMatch(Match match) {
	    if(match.getFirst().equals(match.getWinner()) ||match.getFirst().equals(match.getLoser())) {
		System.out.println(this.getName()+" :\" "+match.getFirst().getName()+ " vs " +match.getSecond().getName()+ " --> " + match.getWinner()+ "  Wins!!!\"");
	    }
	    else {
	    	System.out.println("Please enter players that are currently playing the match");
	    }
	}

	
}

	