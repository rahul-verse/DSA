package src;


public class OOPS {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "Black");
        Car car2 = new Car("BMW", "White");

        // Constructor has already finished executing

        // System.out.println(car1.brand1);
        // System.out.println(car1.color2);

        // System.out.println(car2.brand1);
        // System.out.println(car2.color2);
        // System.out.println(car1.value());

        Student s1 = new Student();

        s1.setMarks(75);
        System.out.println(s1.getMarks());
    }
}

class Car {
    String brand1;  
    String color2;

    Car(String brand, String color) {
        brand1 = brand;
        color2 = color;
    }

    String value(){
        return "hello"+ brand1; 
    }
}


class Student{
    private int marks; 

    public void setMarks(int marks){

        if(marks>=0 && marks <=100){
            this.marks = marks ; 
        }else{
            System.out.println("Invalid marks");
        }
    }

    public int getMarks(){
        return marks; 
    }
}