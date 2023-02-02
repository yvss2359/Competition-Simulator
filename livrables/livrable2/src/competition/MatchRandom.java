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
	protected Competitor winMatch(Competitor c1, Competitor c2) {
		Random random = new Random();
        int res = random.nextInt(2);
        MatchRandom.displayWinner(c1, c2, res);
        if(res==0) return c1;
        else{ 
            return c2;
	}

}
	/**
     * Display the winner of the match
     * @param c1 the first competitor
     * @param c2 the second competitor
     */
    protected static void displayWinner(Competitor c1, Competitor c2,int res){
        if (res == 0){
            System.out.println(c1.getName() +" vs "+c2.getName()+" -->"+ c1.getName()+" wins!");
        }
       else{
            System.out.println(c1.getName() +" vs "+c2.getName()+" -->"+ c2.getName()+" wins!");
       }
        
    }
    
}
