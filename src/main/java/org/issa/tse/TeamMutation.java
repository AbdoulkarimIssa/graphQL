package org.issa.tse;

import graphql.kickstart.tools.GraphQLMutationResolver;

public class TeamMutation implements GraphQLMutationResolver {

    private TeamDao teamDao;

    public TeamMutation(TeamDao teamDao){this.teamDao = teamDao;}

    public Team writeTeam(String id, String name, String colors){

        Team team =  new Team();

        team.setId(id);
        team.setName(name);
        team.setColors(colors);

        return teamDao.saveTeam(team);
    }
}
