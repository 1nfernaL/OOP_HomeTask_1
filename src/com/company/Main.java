package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Container shop=new Container();
        shop.add(new Glasses("Tumbler", 12.99, 200, "for whiskey"));
        shop.add(new Cups("TeaCup",5.99,150,"ceramics", "for tea"));
        shop.add(new Glasses( "Old Fasion", 10.99, 200,"for whiskey" ));
        shop.add(new Cups("CoffeeCup",5.99,100,"ceramics", "for coffee"));
        shop.add(new Cups("PresentCup",7.99,200,"ceramics", "with print"));
        shop.add(new Glasses( "WineGlass", 8.99, 200,"for wine" ));
        shop.showList();
        System.out.println();
        System.out.println("Кол-во товаров: " + Goods.count);
        System.out.println();
        System.out.println("Найти товар №* в списке: " + shop.getIndex(5));
        System.out.println();
        System.out.println("Средняя стоимость бокала: " + Glasses.averageCost() + "\nСредняя стоимость чашки: " + Cups.averageCost());
        System.out.println();
        shop.sortByCost();
        System.out.println("Отсортировать:");
        shop.showList();
        
    }
}
