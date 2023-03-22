package com.ambulance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
public class Ambulance {
    @Getter
    private String ambulanceId;
    @Getter
    private String hospitalName;
    @Getter
    private  String location;
//    @Getter
//    private Address address;
//    @Getter
//    private List<String> phoneNumber;
}
