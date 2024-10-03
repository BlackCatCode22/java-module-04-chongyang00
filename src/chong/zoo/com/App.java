//Chong Yang 10-03-24
// zooVersion1.java

package chong.zoo.com;

public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my Zoo Program.");

        //unit testing

        Animal myNewAnimal = new Animal("male", 4, 120, "Keet", "Zzy98j",
                "2020-3-21", "golden brown","from Mexico");

        System.out.println("\nMy new animal");
        System.out.println("Id is: " + myNewAnimal.getAnimalID() + " and the name is: " + myNewAnimal.getAnimalName() + "\n");

    }
}