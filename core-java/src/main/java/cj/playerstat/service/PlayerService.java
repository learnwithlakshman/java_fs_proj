package cj.playerstat.service;



import cj.playerstat.domain.Player;
import cj.playerstat.dto.RoleStatsDTO;
import cj.playerstat.dto.TeamAmountDTO;
import cj.playerstat.dto.TeamStatsDTO;

import java.util.List;

public interface PlayerService {

        public double getTotalAmount();
        public List<String> getTeamNames();
        public TeamStatsDTO getTeamStats(String teamLabel);
        public List<Player> getMinPaidPlayers();
        public List<Player> getMaxPaidPlayers();

        public List<String> getRoles();
        public RoleStatsDTO getRoleStats(String role);
        public List<TeamAmountDTO> getTeamsAmountDetails();
        public List<RoleStatsDTO> getAllRoleStats();
}
