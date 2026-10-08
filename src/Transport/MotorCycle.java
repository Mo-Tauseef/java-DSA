package Transport;

import java.util.SplittableRandom;

public class MotorCycle extends vehicle{
    public String handlebarStyle;
    public String suspensiontypes;

    MotorCycle(String name,String model, int nooftyers, String handlebarStyle, String suspensiontypes){
        super(name, model, nooftyers);
        this.handlebarStyle = handlebarStyle;
        this.suspensiontypes = suspensiontypes;
    }

    public void wheelie(){
        System.out.println("motorcycle is doing wheelieeee!" + name);
    }
}
