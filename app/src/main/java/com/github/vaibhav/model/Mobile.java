package com.github.vaibhav.model;

import android.util.Log;

import javax.inject.Inject;

/*
 * Question- Why we use Dependency Injection ?
 * - See every language is based on OOPS and on solid principle.
 * so Dependency injection will help us to create an object with proper adherence to the solid principles.
 * it will also reduce boiler code.
 * */

public class Mobile {

    private Battery battery;

    private Processor processor;


    // Constructor Injector - This Injector is most preferable injection if we have constructor.
    @Inject
    public Mobile(Battery battery, Processor processor) {    // after MainActivty Call battery & processor abject will create first
        this.processor = processor; // 1)
        this.battery = battery; // 2)
        Log.i("MyMobile", "Mobile : "); // 3) - then Mobile object will create
    }

    public void run() {
        processor.start();
        Log.i("MyMobile", "Mobile Run : ");
    }

}
