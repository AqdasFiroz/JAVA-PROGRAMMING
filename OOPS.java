import org.w3c.dom.ls.LSOutput;

public class OOPS {
    public static void main(String[] args) {
        dog bob=new dog();
        bob.breed();
        bob.eat();
        fish pinku=new fish();
        pinku.swim();
        pinku.eat();
        bob.legs=4;
        System.out.println(bob.legs);
    }
}
class animal{
    void eat(){
        System.out.println("Eat");
    }
    void color(){
        System.out.println("Color");
    }
}
class mammal extends animal{
    int legs;

}
class fish extends animal{
    void swim(){
        System.out.println("Swim");
    }
}
class dog extends mammal{
    void breed(){
        System.out.println("breed");
    }
}
