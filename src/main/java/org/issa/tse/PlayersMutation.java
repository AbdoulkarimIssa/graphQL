package org.issa.tse;

import graphql.kickstart.tools.GraphQLMutationResolver;

public class PlayersMutation implements GraphQLMutationResolver {
	
	private PlayerDao playerDao;

    public PlayersMutation(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public Player writePlayer(String id, String title, String category, Integer text) {
    	
    	Player player = new Player();
    	player.setId(id);
    	player.setFirstName(title);
    	player.setLastName(category);
    	player.setEquipeId(text);
    	
        return playerDao.savePlayer(player);
    }
}