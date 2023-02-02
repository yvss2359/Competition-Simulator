package competition;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Tournament extends Competition {

	public Tournament(List<Competitor> comp_f, Match match) {
		super(comp_f, match);
	}

	@Override
	protected void play(List<Competitor> competitors) {
		if (this.isPowerOf2()){
            List<Competitor> c = this.createCopy(competitors);
            List<Competitor> copy = c;
            int cpt =1;
            while (copy.size()>1){
                System.out.println("\n***** Round n°"+cpt+ " ******\n");
                Iterator<Competitor> it= copy.iterator();
                while(it.hasNext()){
                    Competitor c1= it.next();
                    if(it.hasNext()){
                        Competitor c2= it.next();
                        playMatch(c1,c2);
                    }
                
                }
                copy = this.removeLosers(c, cpt);
                cpt ++;
            }
            System.out.println("\n");
            System.out.println("The winner of the Tournemament is : "+ this.winner().getName()+ " !!!\n");
        }
        else {
            System.out.println("\n********  The number of the competitors that can play a tournament has to be a power of 2 !!!! ********\n");
        }
    }
    /**
     * Remove the losers from the list of competitors
     * @param competitors the list of competitors
     * @param i the index of removing 
     */
    private List<Competitor> removeLosers(List<Competitor> competitors, int i){
        List<Competitor> res = new ArrayList<Competitor>();
        for( Competitor c : competitors){
            if(c.getPoints() >= i){
                res.add(c);
            }
        }
        return res;

    }
    /**
     * Tells if there is a power of 2 number of players
     * @return <code>true</code> if it'es true and <code>false</code> if it's not
     */
    private boolean isPowerOf2() {
        int nbCompetitors = this.getCompetitors().size();
        if ((nbCompetitors != 0) && ((nbCompetitors & (nbCompetitors - 1)) == 0)){
            return true;
        }
        else {
            return false;
        }
    } 
}

