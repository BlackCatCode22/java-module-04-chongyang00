package chong.zoo.com;


//Chong Yang 092624
//App.java
//driver file for the zoo midterm program

public class App {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Zoo Program!");

        chong.zoo.com.Animal myAnimal = new chong.zoo.com.Animal();
        myAnimal.setAnimalName("Crook");
        System.out.println("\n The name of the new animals is: " + myAnimal.getAnimalName());

        chong.zoo.com.Animal anotherAnimal = new chong.zoo.com.Animal();
        anotherAnimal.setAnimalName("Greg");
        System.out.println("\n The name of another animals is: " + anotherAnimal.getAnimalName());


    }
}