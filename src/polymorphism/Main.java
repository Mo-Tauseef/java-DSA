package polymorphism;

public class Main {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(4,6));
//        System.out.println(c.add(3,5,8));
//        System.out.println(c.add(2,4,6,3.7));
//          Shape s = new Shape();
//          s.draw();
        Circle c = new Circle();
        dodrawing(c);
        ract r = new ract();
        dodrawing(r);
        Shape s = new Shape();
        dodrawing(s);



    }
//    upcasting
    public static void dodrawing(Shape s){
        s.draw();

    }
}
