package com.github.vaibhav.model;

import android.util.Log;

import javax.inject.Inject;

/* Basically idea is if the class is created by ourself then and only we can use @Inject otherwise we
 * have to use Module class and @Provider which means if we can't change parent class like we are using retrofit
 * 3rd party app so we will use Module and @provider in it.
 * */
/*
 *               Battery
 *       |--------|--------|
 *   Lithium             Cobalt
 *
 Part-2 App -  In this App we changed the scenario that we are supposing this class is made by 3rd party vendor so
 * now we have to create a module class and use @provides.

* */
public class Battery {

    private Lithium lithium;
    private Cobalt cobalt;

    public Battery(Cobalt cobalt, Lithium lithium) {
        this.cobalt = cobalt;
        this.lithium = lithium;
        Log.i("MyMobile", "Battery : ");
    }

}
