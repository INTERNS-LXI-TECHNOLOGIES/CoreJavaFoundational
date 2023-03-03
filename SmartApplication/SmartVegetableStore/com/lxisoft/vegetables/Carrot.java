package com.lxisoft.vegetables;

import com.lxisoft.vegetablestore.Vegetable;

public class Carrot  extends Vegetable implements Juicy  {

    @Override
    public String toString() {
        return "Carrot veg Details:" + super.toString();
    }
}
