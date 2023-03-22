package com.ambulance.controller;

import com.ambulance.model.Address;
import com.ambulance.model.Ambulance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class AmbulanceController {
    @GetMapping("/")
    public ArrayList<Ambulance> ambulanceList(){
        Ambulance ambulance1= new Ambulance("123","Paradise Hospital", new Address("San Diego"),List.of("123") );
        Ambulance ambulance2= new Ambulance("123","Paradise Hospital", new Address("San Diego"),List.of("123") );
        ArrayList<Ambulance> arrayList= new ArrayList<Ambulance>();
        arrayList.add(ambulance1);
        arrayList.add(ambulance2);
        return arrayList;
    }
}
