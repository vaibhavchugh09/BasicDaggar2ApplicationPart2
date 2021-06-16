package com.github.vaibhav.modules;

import com.github.vaibhav.model.Battery;
import com.github.vaibhav.model.Cobalt;
import com.github.vaibhav.model.Lithium;

import dagger.Module;
import dagger.Provides;


/* In Module class we have to mention @module on the top of the class name so that injection will notify
 the class & does not treat like a normal class.
 */
@Module
public class BatteryModule {

    /* Note that the only @provides is not enough to make an object there is also dependency upon return
     type which means if you want to make an object with @Provides so you also have to declare return class name
     those you have to make an object.
     */
    @Provides
    static Cobalt getCobalt() {

        return new Cobalt();
    }

    //Here Lithium is the return type
    @Provides
    static Lithium getLithium() {

        Lithium l = new Lithium();
        l.done();
        return l;
    }

    //Here Battery is the return type
    @Provides
    static Battery getBattery(Lithium lithium, Cobalt cobalt) {
        return new Battery(cobalt, lithium);
    }


}
