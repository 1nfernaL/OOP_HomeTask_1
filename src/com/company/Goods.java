package com.company;

public abstract class Goods implements Comparable<Goods>{
    static int count;
    private String name;
    private double cost;


    public Goods() {
    }

    public Goods(String name, double cost) {
        this.name = name;
        this.cost = cost;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int compareTo(Goods o ) {
        return (int) (this.cost-o.getCost());
    }

    @Override
    public String toString() {
        return "Тип товара: "+ name +", Цена за 1шт: "+cost;
    }
}
