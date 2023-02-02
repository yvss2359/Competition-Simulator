package competition;

//The Competitor class
public class Competitor {
	//The competitor's name
    private String name ;
    //The competitor's points 
    private int points;
    

    //The constructor of the class Cmpetitor
    public Competitor(String n){
        this.name = n;
        this.points =0;
    }

    /**get the competitor's points
     * @return the points 
     */
    public int getPoints(){
        return this.points;
    }

    /**get the competitor's name
     * @return the name 
     */
    public String getName(){
        return this.name;
    }

    /**add a point for the competitor's points
     */
    public void addPoint(){
        this.points= this.points+1;
    }
    
    public void setToDefault() {
    	this.points=0;
    }

    /**get information about the competitor
     * @return a sentence with informations
     */
    public String toString(){
        return (this.getName());
    }
    /**show us if a competitor is equal to anothor 
     * @param object the object to compare with
     * @return <code>True</code> if it's true ans <code>False</code> if not
     */
    public boolean equals(Object o){
        if ( o instanceof Competitor){
            Competitor other = (Competitor) o;
            return ((this.getName().equals(other.getName())) && (this.getPoints()==other.getPoints()));
        }
        else{
            return false;
        }
    }
}
