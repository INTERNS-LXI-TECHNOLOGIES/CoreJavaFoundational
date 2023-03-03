package com.lxisoft.vegetables;

import com.lxisoft.vegetablestore.Vegetable;

public class Spinach  extends Vegetable implements LeafEdible{

    @Override
    public String toString() {
        return "Spinach veg Details:" + super.toString();
    }
}
