package com.example.viewmodelexercise;

import android.arch.lifecycle.ViewModel;

public class MyModel extends ViewModel {
    private int color;
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
