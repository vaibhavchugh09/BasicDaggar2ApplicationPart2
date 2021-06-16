package com.github.vaibhav.model;

import android.util.Log;


/*
 * Part-2 App -  In this App we changed the scenario that we are supposing this class is made by 3rd party vendor so
 * now we have to create a module class and use @provides.
 *
 */
public class Lithium {

    public Lithium() {
        Log.i("MyMobile", "Lithium : ");
    }

    // we just created done method to check if we are able to make a object of this method also with the help of module.
    public void done() {

        Log.i("MyMobile", "done : ");
    }


}
