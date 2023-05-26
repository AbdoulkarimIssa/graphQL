package org.issa.tse;

import java.util.List;

import graphql.kickstart.tools.GraphQLQueryResolver;


public class PlayerQurey implements GraphQLQueryResolver {

	private PlayerDao playerDao;

    public PlayerQurey(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public List<Player> getPlayers(int count, int offset) {
        return playerDao.getplayers(count, offset);
    }
}
