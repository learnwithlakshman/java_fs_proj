package com.careerit.cj.collection.list.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerManager {

  public static void main(String[] args) {

    List<Player> list = CsvReaderUtil.loadPlayersFromFile();

    List<Player> playerOfCSK = getPlayerByTeamLabel(list, "CSK");
    playerOfCSK.stream().forEach(e -> {
      System.out.println(e);
    });
    System.out.println(getTeamNames(list));

  }

  public static List<Player> getPlayerByTeamLabel(List<Player> list, String teamLabel) {
//      List<Player> teamPlayersList = new ArrayList<>();
//      for(Player player:list){
//          if(player.getTeamLabel().equalsIgnoreCase(teamLabel)){
//              teamPlayersList.add(player);
//          }
//      }
//      return teamPlayersList;
    return list.stream()
        .filter(e -> e.getTeamLabel().equalsIgnoreCase(teamLabel))
        .collect(Collectors.toList());
  }

  public static List<String> getPlayersNames(List<Player> list) {
//        List<String> namesList = new ArrayList<>();
//        for(Player player:list){
//            namesList.add(player.getName());
//        }
//        return namesList;
    return list.stream()
        .map(player -> player.getName())
        .collect(Collectors.toList());
  }

  public static List<String> getPlayersByNameLikeAndAmountGt(List<Player> list, String name, double amount) {
//    List<String> namesList = new ArrayList<>();
//    for (Player player : list) {
//      if (player.getName().toLowerCase().contains(name) && player.getAmount() >= amount) {
//        namesList.add(player.getName());
//      }
//    }
//    return namesList;
    return list.stream().filter(player -> player.getName().toLowerCase().contains(name) && player.getAmount() >= amount)
        .map(player -> player.getName())
        .collect(Collectors.toList());
  }

  public static double getTotalAmountByTeam(List<Player> list, String teamLabel) {
//        double totalAmount = 0;
//        for(Player player:list){
//            if(player.getTeamLabel().equalsIgnoreCase(teamLabel)){
//                totalAmount += player.getAmount();
//            }
//        }
//        return totalAmount;

    return list.stream().filter(player -> player.getTeamLabel().equalsIgnoreCase(teamLabel))
        .mapToDouble(player -> player.getAmount()).sum();
  }
  // Get player name, role, amount

  public static List<PlayerDto> getPlayersBasicInformation(List<Player> list) {
//           List<PlayerDto> temp = new ArrayList<>();
//           for(Player player:list){
//                PlayerDto obj = new PlayerDto(player.getName(),player.getRole(),player.getAmount());
//                temp.add(obj);
//           }
//           return temp;
    return list.stream().map(player -> convertPlayerToPlayerDto(player)).collect(Collectors.toList());
  }

  // Total amount, player count, max amount, min amount of the given team

  public static TeamStatDto getTeamStats(List<Player> list, String teamLabel) {
    List<Player> teamPlayersList = list.stream()
        .filter(e -> e.getTeamLabel().equalsIgnoreCase(teamLabel))
        .collect(Collectors.toList());
    double maxAmount, minAmount, totalAmount = 0;
    maxAmount = minAmount = teamPlayersList.get(0).getAmount();
    for (Player player : teamPlayersList) {
      if (maxAmount < player.getAmount()) {
        maxAmount = player.getAmount();
      }
      if (minAmount > player.getAmount()) {
        minAmount = player.getAmount();
      }
      totalAmount = player.getAmount();
    }
    int count = teamPlayersList.size();
    return new TeamStatDto(maxAmount, minAmount, totalAmount, count, teamLabel);
  }


  private static PlayerDto convertPlayerToPlayerDto(Player player) {
    return new PlayerDto(player.getName(), player.getRole(), player.getAmount());
  }

  private static Set<String> getTeamNames(List<Player> list){
      return list.stream().map(player->player.getTeamLabel()).collect(Collectors.toSet());
  }
}
