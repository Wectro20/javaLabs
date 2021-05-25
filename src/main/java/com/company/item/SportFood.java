package com.company.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class SportFood extends Item {
    private String mainComponent;
    private String nutritionalValue;

    public SportFood(String name, String brand, float price, Country originCountry,
                     Material material, Gender gender, String size, String typeOfSport,
                     String mainComponent, String nutritionalValue){
        super(name, brand, price, originCountry, material, gender, size, typeOfSport);

        this.mainComponent = mainComponent;
        this.nutritionalValue = nutritionalValue;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Main component: " + mainComponent
                + "|\n|Nutritional value: " + nutritionalValue
                + "|\n________________________\n";
    }
}
