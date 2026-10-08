package Transport;

public class Main {
    static void main() {
//        car c = new car("BMW", "M4", 4, 5, "Auto");
//        c.startengine();
//        c.startAC();
//        c.stopengine();
        MotorCycle m = new MotorCycle("Royal Enfeild", "Classic", 2,"u","soft");
        m.startengine();
        m.stopengine();
        m.wheelie();
    }
}
