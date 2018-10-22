package com.company;

public class Cups extends Goods {
    private double capacity;
    private String material;
    private String type;
    static int count;
    static double sum_price;

    public Cups() {
    }

    public Cups(String name, double cost, double capacity, String material, String type) {
        super(name, cost);
        this.capacity = capacity;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Описание --- " + super.toString()+ ", Объём: "+capacity+ ", Материал: "+ material + ", Тип: "+ type;
    }
}
