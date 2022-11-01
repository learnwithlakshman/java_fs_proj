package cj.playerstat.service;

import com.careerit.cj.playerstat.domain.Player;
import com.careerit.cj.playerstat.dto.RoleStatsDTO;
import com.careerit.cj.playerstat.dto.TeamAmountDTO;
import com.careerit.cj.playerstat.dto.TeamStatsDTO;
import com.careerit.cj.playerstat.util.CsvReaderUtil;

import java.util.List;

public class PlayerServiceImpl implements  PlayerService{
  private List<Player> players = CsvReaderUtil.loadPlayersFromFile();
  @Override
  public double getTotalAmount() {
    return 0;
  }

  @Override
  public List<String> getTeamNames() {
    return null;
  }

  @Override
  public TeamStatsDTO getTeamStats(String teamLabel) {
    return null;
  }

  @Override
  public List<Player> getMinPaidPlayers() {
    return null;
  }

  @Override
  public List<Player> getMaxPaidPlayers() {
    return null;
  }

  @Override
  public List<String> getRoles() {
    return null;
  }

  @Override
  public RoleStatsDTO getRoleStats(String role) {
    return null;
  }

  @Override
  public List<TeamAmountDTO> getTeamsAmountDetails() {
    return null;
  }

  @Override
  public List<RoleStatsDTO> getAllRoleStats() {
    return null;
  }
}
