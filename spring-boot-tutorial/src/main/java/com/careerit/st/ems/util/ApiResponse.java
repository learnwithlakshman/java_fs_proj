package com.careerit.st.ems.util;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ApiResponse {
  private String message;
  private HttpStatus httpStatus;
}
