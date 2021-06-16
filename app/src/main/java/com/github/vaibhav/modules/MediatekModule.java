package com.github.vaibhav.modules;

import com.github.vaibhav.model.MediaTek;
import com.github.vaibhav.model.Processor;

import dagger.Binds;
import dagger.Module;

/* We have two ways to create the Object of interface.
 * 1) In 1st way we are used in MediaTekModule.
 * 2) In this class we make a function abstract and we are used @Binds.
 *  */
@Module
public abstract class MediatekModule {

    // Note that when ever we use abstract we will use @Binds.
    @Binds
    abstract Processor getProcessor(MediaTek mediaTek);

}
