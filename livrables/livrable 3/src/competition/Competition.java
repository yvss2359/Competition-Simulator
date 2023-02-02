package competition;
import java.util.*;
import competition.util.*;

//The class of Competition
public abstract class Competition{
	//The match
    private Match match;
    //The final Competitors
    private final List <Competitor>  competitors;
    
    //The ranking of the competiton
    private Map<Competitor, Integer> rank;
    // the observers of the competition
    protected List<Observer> observers;
    /**
     * The constructor of the class Competition
     * @param comp_f a list of competitors
     */
    public Competition(List <Competitor> comp_f, Match match,List<Observer> ob){
        this.competitors= comp_f;
        this.match= match;
        this.rank= new HashMap<Competitor, Integer>();
        this.observers = ob;
        this.addObservers();
        //this.addCompetitorsToBookMaker(comp_f);
    }
    public Match getMatch() {
		return this.match;
	}
	public Map<Competitor, Integer> getRank() {
		return this.rank;
	}
	/**Play all the Competition and get the result  */
    public void play(){
        this.play(this.competitors);
    }
    /**
     * Play the competition whether it's a tournament or a league or Master
     * @param competitors the competitors of the competitions
     */
    protected abstract void play(List<Competitor> competitors) ;
    /**Play one match of the competition between two competitors 
     * @param c1 the first competitor
     * @param c2 the second competitor
     * @return the winner of the match
     */
    protected void playMatch(Competitor c1, Competitor c2){
        this.match.winMatch(c1, c2);
    	Competitor winner = this.match.getWinner();
        winner.addPoint();
    }
    /**Get the ranking of the Competitors after the Competition
     */
    public Map<Competitor, Integer> ranking(){
        Map<Competitor, Integer> rank = new HashMap<Competitor, Integer>();
        Iterator<Competitor> it = this.competitors.iterator();
        while(it.hasNext()){
            Competitor ref = it.next();
            rank.put(ref, ref.getPoints());
        }
        //sort the ranking 
        Map<Competitor,Integer> res = MapUtil.sortByDescendingValue(rank);

        System.out.println("       ***** Ranking *****  \n");
        for(Competitor c : res.keySet()){
            System.out.println(c.getName()+ " --> "+ res.get(c));
        }
        System.out.println("\n");
        return res;
    }
    /*
     * get the winner of the competition
     */
    
    public Competitor winner(){
        List<Competitor> l = new ArrayList<Competitor>();
        for (Competitor c : this.ranking().keySet()){
              l.add(c);
        }
        return l.get(0);
    }


    /**
     * Create a copy of the competitors list
     * @param comp the competitors of the competition
     * @return the copy of the list
     */
    protected List<Competitor> createCopy(List<Competitor> comp){
        List<Competitor> copy = new ArrayList<Competitor>();
        for(Competitor c : comp){
            copy.add(c);
        }
        return copy;
    }
    
    /*
     * set the points of all competitors to zero
     * @param comps the competitors
     */
    public void setToZero(List<Competitor> comps) {
    	for(Competitor c : comps) {
    		c.setToDefault();
    	}
    }

    /*
     * get the competitors
     * return the competitors
     */
    public List<Competitor> getCompetitors(){
        return this.competitors;
    }
    /*
     * get the observers of the competition
     * return the observers
     */
    public List<Observer> getObservers(){
    	return this.observers;
    }
    /*
     * add the observers to each match of the competition
     */
    public void addObservers() {
		for(Observer ob:this.getObservers()) {
			this.getMatch().addObserver(ob);
		}
	}
   
    
  
    
}
