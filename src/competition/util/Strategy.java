package competition.util;

import java.util.List;
import java.util.Map;

import competition.Competitor;

/** Interface that can be implemented by strategies for choosing the winners of the first pool*/
public interface Strategy {
	/** returns the next coordinates that will be used by the bound player.
	 * @return The winners of the first round.
	 */
	public List<Competitor> chooseWinners(List<Map<Competitor, Integer>> group);
}
