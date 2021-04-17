package com.company;

public class Conference {
    private static float duration = 2;

    private String name;
    private String cityOfHolding;
    private int amountOfParticipants;
    private float priceOfTicket;

    private String day;
    private String aim;
    private String street;
    private String country;
    private double time;

    protected int floor;
    protected int hallNumber;


    public Conference() {}

    public Conference(String name, String cityOfHolding, int amountOfParticipants, float priceOfTicket) {
        resetValues(name, cityOfHolding, amountOfParticipants, priceOfTicket,null, null, null,
                null,0.0d,0,0);
    }

    public Conference(String name, String cityOfHolding, int amountOfParticipants, float priceOfTicket,
                      String day, String aim, String street, String country, double time,
                      int floor, int hallNumber) {
        resetValues(name,cityOfHolding,amountOfParticipants,priceOfTicket,day,aim,street,country,time,floor,hallNumber);
    }


    //getters&setters
    public static float getDuration() {
        return duration;
    }

    public static void setDuration(float duration) {
        Conference.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityOfHolding() {
        return cityOfHolding;
    }

    public void setCityOfHolding(String cityOfHolding) {
        this.cityOfHolding = cityOfHolding;
    }

    public int getAmountOfParticipants() {
        return amountOfParticipants;
    }

    public void setAmountOfParticipants(int amountOfParticipants) {
        this.amountOfParticipants = amountOfParticipants;
    }

    public float getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(float priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

//methods
    public static void printStaticDuration(){
        System.out.println("Duration from class: " + duration + " hours ");
    }
    public void printDuration(){
        System.out.println("Duration from object: " + duration + " hours ");
    }
    public void resetValues(String name, String cityOfHolding, int amountOfParticipants, float priceOfTicket,
                            String day, String aim, String street, String country, double time,
                            int floor, int hallNumber){
        this.name = name;
        this.cityOfHolding = cityOfHolding;
        this.amountOfParticipants = amountOfParticipants;
        this.priceOfTicket = priceOfTicket;
        this.day = day;
        this.aim = aim;
        this.street = street;
        this.country = country;
        this.time = time;
        this.floor = floor;
        this.hallNumber = hallNumber;
    }
    @Override
    public String toString(){
        return "________________________" +
                "\n|Name: " + name +
                "|\n|City of holding: " + cityOfHolding +
                "|\n|Amount of participants: " + amountOfParticipants +
                "|\n|Price of ticket: " + priceOfTicket +
                "|\n|Day: " + day +
                "|\n|Aim: " + aim +
                "|\n|Street: " + street +
                "|\n|Country " + country +
                "|\n|Time: " + time +
                "|\n|Floor: " + floor +
                "|\n|Hall number: " + hallNumber +
                "|\n________________________\n";
    }
}
