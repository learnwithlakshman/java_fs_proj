package com.careerit.cj.collection.list.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamStatDto {
  private double maxAmount;
  private double minAmount;
  private double totalAmount;
  private int count;
  private String teamLabel;
}
