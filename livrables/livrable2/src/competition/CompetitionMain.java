package competition;

import java.util.List;
import java.util.ArrayList;

public class CompetitionMain {

	public static void main(String[] args) {
		List<Competitor> l = new ArrayList<Competitor>();
        System.out.println("\n");
        System.out.println("********* Hey!! Welcome to the Competition !!!***********\n");
        System.out.println("Please enter the number of competitors you have :\n");
        int nb= Integer.parseInt(args[0]) ;
        System.out.println("\n");
        System.out.println("Please enter the competitors one in a row with a space between them :\n");
        for (int i =0; i< nb; i++){
            l.add(new Competitor(args[i]));
        }

	}

}
