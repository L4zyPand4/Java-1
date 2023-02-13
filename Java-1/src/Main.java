import java.util.Scanner;
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

        System.out.println("What is your name? (Without spaces) ");
        String name = INPUT.next();
           if(name != null){
            System.out.println("Name confirmed.");
           }

           else{
            System.out.println("ERROR");
            return;
           }

        System.out.println("Where are you from?");
           String country = INPUT.next();
           if(country.equalsIgnoreCase("Iran")) {
              System.out.println("سلام" + " " + name);
           }

           else if(country.equalsIgnoreCase("Canada")){
               System.out.println("Hello" + " " + name);
           }
           else if (country.equalsIgnoreCase("Germany")) {
               System.out.println("Hallo" + " " + name);
           }

           else{
               System.out.println("Unknown region.");
           }
    }
}