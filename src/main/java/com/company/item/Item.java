package com.company.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Item {
    private String name;
    private String brand;
    private float price;
    private Country originCountry;
    private Material material;
    private Gender gender;
    private String size;
    private String typeOfSport;

    @Override
    public String toString() {
        return itemToString() + "\n________________________\n";
    }

    public String itemToString() {
        return "________________________"
                + "\n|Name: " + name
                + "|\n|brand: " + brand
                + "|\n|Price: " + price
                + "|\n|Country: " + originCountry
                + "|\n|Material: " + material
                + "|\n|Gender: " + gender
                + "|\n|Size: " + size
                + "|\n|Type of sport: " + typeOfSport;
    }
}

