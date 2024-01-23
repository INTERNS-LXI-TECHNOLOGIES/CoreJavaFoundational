package com.lxisoft.vegetables;

import com.lxisoft.vegetablestore.Vegetable;

public class Potato extends Vegetable implements RootEdible  {

    @Override
    public String toString() {
        return "Potato veg Details:" + super.toString();
    }
}
