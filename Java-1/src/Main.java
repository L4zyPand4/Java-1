import java.util.Scanner;
import org.bukkit.entity;
public class Main {
    public static void main(String[] args) {

        System.out.println("How old are you?");
        Scanner INPUT = new Scanner(System.in);
        int age = INPUT.nextInt();

        if (age < 18) { //ilegal
            System.out.println("You do not meet the age requirment.");
            return;
        }

        else { //legal
            System.out.println("Welcome!");
        }

        System.out.println("What is your first name?");
        String name = INPUT.next();
           if(name != null){
            System.out.println(" ");
           }

           else{
            System.out.println("ERROR");
            return;
           }


        System.out.println("What is your last name?");
        String lastname = INPUT.next();
        if(lastname != null){
            System.out.println("Name confirmed.");
        }

        else{
            System.out.println("ERROR");
            return;
        }

        System.out.println("Where are you from?");
           String country = INPUT.next();
           if(country.equalsIgnoreCase("Iran")) {
              System.out.println("سلام" + " " + name +" "+ lastname);
           }

           else if(country.equalsIgnoreCase("Canada")){
               System.out.println("Hello" + " " + name +" "+ lastname);
           }
           else if (country.equalsIgnoreCase("Germany")) {
               System.out.println("Hallo" + " " + name +" "+ lastname);
           }

           else{
               System.out.println("Unknown region.");
           }
           
    }
}