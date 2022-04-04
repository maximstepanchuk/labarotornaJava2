package com.company.manager;

import com.company.model.Country;
import com.company.model.Travel;
import com.company.model.TravelType;
import com.company.processor.impl.TravelAgency;

import java.util.List;

public class TravelManager extends TravelAgency {

    public TravelManager(Country country, int duration_in_days, TravelType type, boolean in_stock, int price_in_uah) {
        super(country, duration_in_days, type, in_stock, price_in_uah);
    }


    List <Travel> sortListByDuration(){
        return null;
    }

    List <Travel> sortListByPrice(){
        return null;
    }

}
