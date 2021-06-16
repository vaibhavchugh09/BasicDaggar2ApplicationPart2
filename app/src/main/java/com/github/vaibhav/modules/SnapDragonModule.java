package com.github.vaibhav.modules;

import com.github.vaibhav.model.Processor;
import com.github.vaibhav.model.SnapDragon;

import dagger.Module;
import dagger.Provides;

/* We have two ways to create the Object of interface.
* 1) In this class we will use 1st way that we are returning the object of implemented class.
* 2) and 2nd way we will us in MediaTekModule.
*  */
@Module
public class SnapDragonModule {

    // Processor is the interface so we cannot make an direct object so we will pass its implemented
    // class and return them.
    @Provides
    static Processor getProcessor(SnapDragon snapDragon) {
        return snapDragon;
    }

}
