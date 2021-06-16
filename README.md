"# BasicDaggar2ApplicationPart2" 
### This is part 2 of the Dagger application and if you haven't seen the first part yet, please go there first.
### In this Application you will learn about @Module , @Provides & @Binds.
### Below will be the flow :-
 *                           Mobile
 *                 |------------|-------------|
 *               Battery                   Processor // Now i am changing Processor class into interface
 *       |--------|--------|       |---------|----------|
 *       Lithium        Cobalt  SnapDragon           MediaTek
 *
 *  Mobile has two child class and further Battery has two child classes.
 *  
