package com.basics.quest5;

public class Mobile {

    private String model;
    private String brand;
    private double price;

    public Mobile(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void getDetails(){
        System.out.println("Mobile : " + getModel() + " belongs to " + getBrand() + " Priced at : "+ getPrice());
    }

    String[] showFeature(){
        if(getBrand().equalsIgnoreCase("APPLE")){
            return new String[]{"12 MP Camera", "iOS 18", };
        }else if (getBrand().equalsIgnoreCase("SAMSUNG")){
            return new String[]{"24 MP Camera", "Snapdragon 888"};
        }
        else
            return new String[]{};
    }
}
