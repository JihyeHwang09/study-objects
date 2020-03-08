package com.johngrib.objects._04_movie_data_system;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class Screening {
  @Getter
  @Setter
  private Movie movie;
  @Getter
  @Setter
  private int sequence;
  @Getter
  @Setter
  private LocalDateTime whenScreened;
}
