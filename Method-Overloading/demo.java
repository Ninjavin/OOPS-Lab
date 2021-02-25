class Animal{
    public void move(){
        System.out.println("Animals can move.");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Dogs can move.");
    }
    public void bark(){
        System.out.println("Dogs can bark.");
    }    
}

public class demo{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();
        Dog c = new Dog();

        a.move();
        b.move();
        b.bark();
        c.bark();
    }
}