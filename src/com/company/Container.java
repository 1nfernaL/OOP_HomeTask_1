package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container {

    List<Goods> all;

    public Container() {
        this.all = new ArrayList<Goods>();
    }

    public void add(Goods newGood) {
        all.add(newGood);
    }
    public Goods getIndex(int index) {
        if (index>all.size()) {
            throw new UnsupportedOperationException("Нет товара под таким номером");
        } else
        return all.get(index);
    }
    public int count() {
        return all.size();
    }

    public void sortByCost() {
        Collections.sort(all);
    }
    public void showList() {
        for (Goods a :
                all) {
            System.out.println(a);
        }
    }

}
