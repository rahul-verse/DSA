package src;

public class Inheritance {
    public static void main(String[] args) {
        Animal obj = new dog(); 

        obj.bark();
        obj.eat();
        obj.sound();

    }
}

class Animal {

    // Animal(String animalSound){
    //     System.out.println("Animal making sound of :"+animalSound);
    // }
    void eat(){
        System.out.println("Eating...");
    }

    void bark(){
        System.out.println("Barking...!");
    }

    void sound(){
        System.out.println("Animal is making sound with their parent");
    }
}

class dog extends Animal{
    
    //  dog(String name){
    //     super("Meow");
    //     System.out.println("dog breed: "+name);
    // }
    void bark(){
        System.out.println("Barking...!");
    }

    @Override 
    void sound(){
        System.out.println("Animal is making sound with their child");
    }
}