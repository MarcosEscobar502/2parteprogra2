package com.example.demo.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode

public class Weather {
    private String status;
    private Integer minTemp;
    private Integer maxTemp;

}
