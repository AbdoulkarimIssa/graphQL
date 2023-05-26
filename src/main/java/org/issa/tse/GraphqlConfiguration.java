package org.issa.tse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

	@Bean
    public PlayerDao postDao() {
        List<Player> players = new ArrayList<>();
        for (int postId = 0; postId < 10; ++postId) {
            Player player = new Player();
            player.setId("" + postId);
            player.setLastName("LastName " + postId);
            player.setFirstName("Text " + postId);
            player.setEquipeId(postId);
            players.add(player);
        }
        return new PlayerDao(players);
    }
	
	@Bean
	public TeamDao teamDao() {
		
		List<Team> teams = new ArrayList<>();
		
		Team team1 = new Team();
		team1.setId("FRA");
		team1.setName("France");
		team1.setColors("Bleu, blanc, rouge");
		teams.add(team1);
		
		Team team2 = new Team();
		team2.setId("SP");
		team2.setName("Spain");
		team2.setColors("Rouge, jaune");
		teams.add(team2);
		
		return new TeamDao(teams);
	}
	
	@Bean
    public PlayerQurey playerQurey(PlayerDao playerDao) {
        return new PlayerQurey(playerDao);
    }
	
	@Bean
    public TeamsQuery teamsQuery(TeamDao teamDao) {
        return new TeamsQuery(teamDao);
    }
	
	@Bean
    public PlayersMutation mutation(PlayerDao playerDao) {
        return new PlayersMutation(playerDao);
    }

    @Bean
    public TeamMutation teamMutation(TeamDao teamDao){ return new TeamMutation(teamDao);}
}
