package competition;

//The class that creates Matches
public abstract class Match {
	/**
     * The constructor of the class Match
     */
    public Match(){

    }
    /**
     * Get the winner of the match 
     * @param c1 the first competitor
     * @param c2 the second competitor
     * @return the winner of the match
     */
    protected  abstract Competitor winMatch(Competitor c1, Competitor c2);
    }

