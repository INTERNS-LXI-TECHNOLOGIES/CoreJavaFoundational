package com.lxisoft.fruitsStore.fruits;

import com.lxisoft.fruitsStore.entity.Fruit;

public class Orange extends Fruit implements Juicable {

    @Override
    public String toString() {
        return "Orange Details : " + super.toString();
    }

    
}
