package competition;

import java.util.List;


//The League is a type of Competition that define the winner with the number of points 
public class League extends Competition {

	public League(List<Competitor> competitors, Match match){
        super(competitors,match);
	}

	@Override
	protected void play(List<Competitor> competitors) {
		for(Competitor c1 : competitors){
            List<Competitor> copy = this.createCopy(competitors);
            copy.remove(c1);
            for (Competitor c2 : copy){
                //play one match in a row
                this.playMatch(c1,c2);

            }
            //remove the copy because we don't need it anymore
            copy.removeAll(copy);
        }
        System.out.println("\n");
        //Display the ranking
        this.ranking();
	}

}
