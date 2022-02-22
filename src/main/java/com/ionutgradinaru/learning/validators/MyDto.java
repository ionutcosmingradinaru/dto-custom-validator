package com.ionutgradinaru.learning.validators;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@MyAnnotation ()
public class MyDto {

  private String name;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate startTime;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate endTime;
  private String status;
}
