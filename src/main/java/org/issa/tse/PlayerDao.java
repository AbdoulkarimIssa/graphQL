package org.issa.tse;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerDao {

	private List<Player> players;

    public PlayerDao(List<Player> players) {
        this.players = players;
    }

    public List<Player> getplayers(int count, int offset) {
    	
    	return this.players.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

	public Player savePlayer(Player player) {
		
		this.players.add(player);
		
		return player;
	}
}
