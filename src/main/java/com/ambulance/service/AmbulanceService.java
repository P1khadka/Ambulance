package com.ambulance.service;

import com.ambulance.model.Address;
import com.ambulance.model.Ambulance;

import java.util.ArrayList;
import java.util.List;

public class AmbulanceService {
    public List<Ambulance> ambulanceList(){
        Ambulance ambulance1= new Ambulance("123","Paradise Hospital", new Address("San Diego"),List.of("123") );
        Ambulance ambulance2= new Ambulance("123","Paradise Hospital", new Address("San Diego"),List.of("123") );
        ArrayList<Ambulance> arrayList= new ArrayList<Ambulance>();
        arrayList.add(ambulance1);
        arrayList.add(ambulance2);
        return arrayList;
    }
}
