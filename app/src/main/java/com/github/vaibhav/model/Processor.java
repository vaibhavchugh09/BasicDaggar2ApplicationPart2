package com.github.vaibhav.model;

import android.util.Log;

import javax.inject.Inject;

// In Part-1 project it was a class and now we are changing this into interface.
/*             Processor      // Now i am changing Processor class into interface
 *      |---------|----------|
 *  SnapDragon           MediaTek
 */
public interface Processor {

    void start();

}
