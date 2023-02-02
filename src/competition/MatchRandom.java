package competition;

import java.util.Random;

//The class that creates Random Matches extended from Match
public class MatchRandom extends Match {
	/**
    * The constructor of the class MatchRandom
    */
	public MatchRandom() {
        super();	}

	@Override
	protected void winMatch(Competitor c1, Competitor c2) {
		this.first=c1;
		this.second=c2;
		Random random = new Random();
        int res = random.nextInt(2);
      
        if(res==0) {
        	this.setWinner(c1);
        	this.setLoser(c2);
        	
        }
        else{ 
        	this.setWinner(c2);
        	this.setLoser(c1);
            
        }
        
        this.fireEndMatch(this);
        	
}
	

    
}
