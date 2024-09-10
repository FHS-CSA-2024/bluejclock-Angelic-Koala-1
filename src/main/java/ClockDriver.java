package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        ClockDisplay oldClock = new ClockDisplay();
        oldClock.setTime(2, 45);
        System.out.println(oldClock.getTime());
        
        tickTest(oldClock, 3, 32);
        tickTest(oldClock, 3, 9);
        tickTest(oldClock, 1, 59);
        tickTest(oldClock, 9, 59);
        tickTest(oldClock, 23, 59);
        
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds smartClock = new ClockDisplaySeconds();
        
        tickTest(smartClock, 3, 32, 59, true);
        tickTest(smartClock, 1, 0, 59, true);
        tickTest(smartClock, 1, 59, 59, true);
        tickTest(smartClock, 12, 59, 59, true);
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        tickTest(smartClock, 3, 32, 59, false);
        tickTest(smartClock, 11, 59, 59, false);
        tickTest(smartClock, 11, 59, 59, true);
        tickTest(smartClock, 12, 59, 59, false);
    }
    
    private static void tickTest(ClockDisplay clock, int hour, int minute){
        clock.setTime(hour, minute);
        clock.timeTick();
        System.out.println("tick test: ");
        System.out.println(clock.getTime());
    }
    
    private static void tickTest(ClockDisplaySeconds clock, int hour, int minute, int second, boolean morning){
        clock.setTime(hour, minute, second, morning);
        clock.timeTick();
        System.out.println("tick test: ");
        System.out.println(clock.getTime());
    }
}
