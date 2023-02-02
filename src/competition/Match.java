package competition;

import java.util.ArrayList;
import java.util.List;

//The class that creates Matches
public abstract class Match {
	/*
	 * the winner of the match
	 */
	protected Competitor winner;
	/*
	 * the looser of the match
	 */
	protected Competitor loser;
	/*
	 * the observers of the match
	 */
	protected 	List<Observer> observers;
	
	/*
	 * the first competitor of the match
	 */
	protected Competitor first;
	
	/*
	 * the second competitor of the match
	 */
	protected Competitor second;
	
	/**
     * The constructor of the class Match
     */
    public Match() {
    	this.observers = new ArrayList<Observer>();
    	
    }
    /**
     * Get the winner of the match 
     * @param c1 the first competitor
     * @param c2 the second competitor
     * @return the winner of the match
     */
    protected  abstract void winMatch(Competitor c1, Competitor c2);
    
    /*
     * get the winner of the match
     */
    public Competitor getWinner() {
    	return this.winner;
    }
    /*
     * get the loser of the match
     */
    public Competitor getLoser() {
    	return this.loser;
    }
    /*
     * set the winner of the match
     */
    public void setWinner(Competitor c) {
    	this.winner=c;
    }
    /*
     * set the loser of the match
     */
    public void setLoser(Competitor c) {
    	this.loser = c;
    }
   /*
    * add an observer to the list of the observers
    * @param ob, an observer
    */
   
    
    
    /*
     * get the first competitor of the match 
     */
    public Competitor getFirst() {
    	return this.first;
    }
    /*
     * get the second competitor of the match
     */
    public Competitor getSecond() {
    	return this.second;
    }
    
    
    public void addObserver(Observer ob) {
    	this.observers.add(ob);
    }
    /*
     * remove an observer from the list of the observers
     */
    public void removeObserver(Observer ob) {
    	this.observers.remove(ob);
    }
    
    /*
     * notifies the observers about the end of the match
     * @param the match
     */
	 protected void fireEndMatch(Match m) {
	        for(Observer ob : this.observers) {
	        	ob.reactToMatch(m);
	        }
	    }	
    
    }

