public class Question6 {
    //Create a program that scans for a student's number grade number prints a student's letter grade based on the following conditions:
//if a student's grade is between 90 and 100 then print you got an A
//if a student's grade is between 89 and 80 then print you got a B
//if a student's grade is between 79 and 70 then print you got a C
//if a student's grade is between 69 and 60 then print you got an D
//if a student's grade is  59 and below then print you got an F
    public static void finalGrade(int grade) {
        int x = grade;
        if (x >= 1 && x <= 59){
            System.out.println("you got an F");}

        if (x <= 69 && x >= 60){
            System.out.println("you got a D");}
        if (x <= 79 && x >= 70){
            System.out.println("you got a C");}

        if (x <= 89 && x >= 80){
            System.out.println("you got a B");}

        if (x >= 90 && x <= 100){
            System.out.println("you got a A");}



    }

    public static void main(String[] args) {

        finalGrade(99);

    }
}