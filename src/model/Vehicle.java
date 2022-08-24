package model;

public class Vehicle {
    private String brand;
    private String nameId;
    private String color;
    private int seats;

    public Vehicle(String brand, String nameId, String color, int seats) {
        this.brand = brand;
        this.nameId = nameId;
        this.color = color;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getNameId() {
        return nameId;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public String setBrand(String newBrand) {
        this.brand = newBrand;
        return newBrand;
    }

    public String setNameId(String newNameId) {
        this.nameId = newNameId;
        return newNameId;
    }

    public String setColor(String newColor) {
        this.color = newColor;
        return newColor;
    }

    public int setSeats(int newSeat) {
        this.seats = newSeat;
        return newSeat;
    }

}
