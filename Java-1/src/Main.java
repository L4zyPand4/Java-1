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

        System.out.println("What is your name?");
        String name = INPUT.nextLine();
        if(name == INPUT.nextLine()){
            System.out.println("Hello," + name);
        }

        else{
            System.out.println("Invalid name.");
            return;
        }




    }
}