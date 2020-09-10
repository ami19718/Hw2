import java.util.Scanner;

public class Question1 {
    //Create a program that keeps asking for a password
    //Make sure you are using the Scanner Class/Object
    //Once the user gets the password correct
    //Print out a message to the user eg: logged in
    //Keep track of how many wrong attempts they made
    //Then display their number of wrong attempts
    public static void logIn(){
        int attempts = 1;
        String greet = "hello enter password";
        System.out.println(greet);
        String passW = "helloW";

        boolean indicator = false;
        while (!indicator){
            Scanner scanPass = new Scanner(System.in);
            String userPass = scanPass.nextLine();
            if (userPass.equals(passW)){
                System.out.println("Welcome");
                indicator = true;
            }
            else {
                System.out.println("Invalid Password....Try again");
                System.out.println("Attemps:" + attempts);
                attempts++;
            }
        }


    }

    public static void main(String[] args) {
    logIn();
    }
}
