package cj.collection.map;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Gender gender;
  private String password;
}
