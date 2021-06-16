package com.github.vaibhav.model;

import android.util.Log;

import javax.inject.Inject;

public class SnapDragon implements Processor {


    @Inject
    public SnapDragon() {
        Log.i("MyMobile", "SnapDragon : ");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "SnapDragon start: ");
    }
}
