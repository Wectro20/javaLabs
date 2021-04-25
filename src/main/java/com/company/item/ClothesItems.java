package com.company.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class ClothesItems extends Item {
    private Season season;
    private float temperature;

    public ClothesItems(String name, String brand, float price, Country originCountry,
                        Material material, Gender gender, String size, String typeOfSport,
                        Season season, float temperature){
        super(name, brand, price, originCountry, material, gender, size, typeOfSport);

        this.season = season;
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Season: " + season
                + "|\n|Temperature: " + temperature
                + "|\n________________________\n";
    }
}
