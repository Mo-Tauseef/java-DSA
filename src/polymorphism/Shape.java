package polymorphism;

public class Shape {
    public void draw() {
        System.out.println("generic shape drawing..");
    }
}
    class Circle extends Shape{
        @Override
        public void draw(){
            System.out.println("circle is drawing..");
        }
    }
    class ract extends Shape{
    public void draw(){
        System.out.println("ract is drwaing...");
    }
    }

