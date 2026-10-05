//package AbstractDesign;
//
//abstract class Bird{
//    abstract void fly();
//    abstract void eat();
//}
//class Sparrow extends Bird{
//    @Override
//    void fly(){
//        System.out.println("Sparrow is flying");
//    }
//    @Override
//    void eat(){
//        System.out.println("Sparrow is eating");
//    }
//}
//
//
//public class Main {
//    public static void doBirdstuff(Bird b){
//        b.fly();
//        b.eat();
//    }
//    static void main() {
//       doBirdstuff(new Sparrow());
//    }
//}


package AbstractDesign;

interface Bird{
    abstract void fly();
    abstract void eat();
    default void sleep(){
        System.out.println("Bird is sleeping");
    }
}
class Sparrow implements Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
    @Override
    public void eat(){
        System.out.println("Sparrow is eating");
    }
}
class Crow implements Bird{
    @Override
    public void fly(){
        System.out.println("Crow is flying");
    }
    @Override
    public void eat(){
        System.out.println("Crow is eating");
    }
}


public class Main {
    public static void doBirdstuff(Bird b){
        b.fly();
        b.eat();
        b.sleep();
    }
    static void main() {
        doBirdstuff(new Sparrow());
        doBirdstuff(new Crow());
    }
}
