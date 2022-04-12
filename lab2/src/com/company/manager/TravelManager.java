package com.company.manager;
import com.company.model.Country;
import com.company.model.Travel;
import com.company.model.TravelType;
import com.company.processor.TravelAgency;
import java.util.*;

public class TravelManager extends TravelAgency {

    public String nameOfManager;

    public TravelManager(String nameOfAgency, String nameOfManager) {
        super(nameOfAgency);
        this.nameOfManager = nameOfManager;
    }

    private Map <Travel, Integer> mapOfTravel = new HashMap<>();

    public void addTravel(Travel travel, int places){
        if (mapOfTravel == null)
            mapOfTravel.put(travel, places);
        else if (mapOfTravel.keySet().contains(travel))
            mapOfTravel.put(travel, places);
        else mapOfTravel.computeIfPresent(travel, (k,v) -> v + places);
    }




}
