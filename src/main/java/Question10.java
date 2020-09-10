import java.util.Scanner;

public class Question10 {
//Create a method that calculates the circumference of a circle
    public static double calculateAreaOfaCircle(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Gimme radius");
            double userInput1 = scan.nextInt();


            return userInput1 * userInput1 * Math.PI;

        }
        public static void main(String[] args) {
            System.out.println(calculateAreaOfaCircle());
        }

}