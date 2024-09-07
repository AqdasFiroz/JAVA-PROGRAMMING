public class Parameterized_constructor {

        public static void main(String[] args){
            Circle c = new Circle(2);
            System.out.println(c.perimeter);
            Square s=new Square(4);
            System.out.println(s.perimeter);
            Rectangle r=new Rectangle(2,4);
            System.out.println(r.perimeter);
        }


}
class Circle{
    double perimeter;
    Circle(double r){
        this.perimeter=2*3.14*r;

    }

}
class Square{
    double perimeter;
    Square(double s){
        this.perimeter=4*s;

    }

}
class Rectangle{
    double perimeter;
    Rectangle(double l,double b){
        this.perimeter=2*(l+b);

    }

}