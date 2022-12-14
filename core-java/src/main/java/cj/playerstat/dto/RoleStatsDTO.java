package cj.playerstat.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RoleStatsDTO {
    private String roleName;
    private int playerCount;
    private double totalAmount;
    private double maxAmount;
    private double minAmount;
    private double avgAmount;
}
