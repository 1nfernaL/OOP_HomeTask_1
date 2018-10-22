package com.company;

public class Glasses extends Goods{
     private double capacity;
     private String type;
    static int count;
    static double sum_price;

    public Glasses() {
    }

    public Glasses(String name, double cost, double capacity, String type) {
        super(name, cost);
        this.capacity = capacity;
        this.type = type;
        count++;
        sum_price+=cost;
    }

    static double averageCost() {
        return sum_price/count;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Описание --- " +super.toString()+ ", Объём: "+capacity+ ", Тип: "+ type;
    }
}
