// Chong Yang 10-01-24
// timeAndAnimalClass.java

import java.util.Date;
import java.text.SimpleDateFormat;

public class TodaysDate {


    public static void main(String[] args) {

        System.out.printf("\n Hello and welcome to dates and animal class!\n");

        Date today = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        System.out.println("\n Todays date in format is " + strTodaysDate);

        //4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        //12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // write code to calculate birthdates for animals then create method that returns
        // a string for their bday

        //imput: "4 year old female hyena, born in spring"
        //processing: find the age adn birth season
        ///           and  then use decision control structure to calculate the date

        // parse the string first
        String strStarting = "4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia";

        //split the string ","
         String [] arrayOfStrPartsOnComma = strStarting.split(", ");

         //output the array element
        //this is a for : each loop

        for (String thePart : arrayOfStrPartsOnComma){
            System.out.println("\nelement of the string is:" + thePart);
        }
        String [] arrayOfStrPartOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        for (String thePart : arrayOfStrPartOnSpace){
            System.out.println("element of the string is: " + thePart);
        }
        String [] arrayOfStrPartOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        for (String thePart : arrayOfStrPartOnSpace02){
            System.out.println("element of the string is: " + thePart);
        }
        String ageInYears = arrayOfStrPartOnSpace[0];
        String animalBirthSeason = arrayOfStrPartOnSpace02[2];
        System.out.println("\nThe age in years of the animal is: " + ageInYears);
        System.out.println("\nThe season of brith of the animal is: " + animalBirthSeason);


        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthyear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthyear) + "-03-21";
        }
        if (animalBirthSeason.contains("fall")){
            animalBirthdate = Integer.toString(animalBirthyear) + "-09-21";
        }
        if (animalBirthSeason.contains("winter")){
            animalBirthdate = Integer.toString(animalBirthyear) + "-12-21";
        }

        if (animalBirthSeason.contains("summer")){
            animalBirthdate = Integer.toString(animalBirthyear) + "-06-21";
        }

        System.out.println("\n animalBirthdate is " + animalBirthdate);

    }
}