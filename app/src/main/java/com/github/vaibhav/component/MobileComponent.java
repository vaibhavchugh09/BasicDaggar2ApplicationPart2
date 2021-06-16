package com.github.vaibhav.component;

import com.github.vaibhav.MainActivity;
import com.github.vaibhav.model.Mobile;
import com.github.vaibhav.modules.BatteryModule;
import com.github.vaibhav.modules.MediatekModule;
import com.github.vaibhav.modules.SnapDragonModule;

import dagger.Component;

/* note :- we cannot run both MediaTekModule and SnapDragonModule class simultaneously because
* Dagger will confuse from where it will create a object of processor i.e from SnapDragon or MediaTek class.
* */

// You can uncomment below line and comment 2nd line and check the result.
//@Component(modules = {BatteryModule.class, SnapDragonModule.class})
@Component(modules = {BatteryModule.class, MediatekModule.class})
public interface MobileComponent {

    Mobile getmobile();

    void inject(MainActivity activity);

}
