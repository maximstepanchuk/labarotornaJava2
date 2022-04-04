package com.company.model;

public class Travel {
    public Country country;
    public int duration_in_days;
    public TravelType type;
    public boolean in_stock;
    public int price_in_uah;

    public Travel(Country country, int duration_in_days, TravelType type, boolean in_stock, int price_in_uah) {
        this.country=country;
        this.duration_in_days=duration_in_days;
        this.type=type;
        this.in_stock=in_stock;
        this.price_in_uah=price_in_uah;
    }

    public Travel() {

    }
}
