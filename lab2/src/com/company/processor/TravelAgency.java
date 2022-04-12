package com.company.processor;

import com.company.model.Country;
import com.company.model.Travel;
import com.company.model.TravelType;

public class TravelAgency extends Travel {
    public String nameOfAgency;

    public TravelAgency(String nameOfAgency) {
        super();
        this.nameOfAgency =nameOfAgency;
    }

    public TravelAgency(Country country, int duration_in_days, TravelType type, boolean in_stock, int price_in_uah) {
        super(country, duration_in_days, type, in_stock, price_in_uah);
    }

    Travel Ukraine = new Travel(Country.Ukraine, 4, TravelType.recreation, true, 15000);
    Travel USA = new Travel(Country.USA, 7, TravelType.sport, false, 75000);
    Travel France = new Travel(Country.France, 3, TravelType.family, true, 30000);
    Travel Spain = new Travel(Country.Spain, 14, TravelType.recreation, true, 800000);
    Travel China = new Travel(Country.China, 7, TravelType.sport, false, 48600);

}
