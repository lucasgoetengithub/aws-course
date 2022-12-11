package com.lgoeten.awscourse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Machine {

    private String ip;
    private String name;
    private String os;
    private String architecture;
    private String osVersion;


}
