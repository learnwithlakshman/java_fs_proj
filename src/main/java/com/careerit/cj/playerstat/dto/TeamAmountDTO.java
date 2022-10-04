package com.careerit.cj.playerstat.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TeamAmountDTO {
        private String teamName;
        private double totalAmount;
}
