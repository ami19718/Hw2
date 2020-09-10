public class Question7 {
//Create a method that prints from 45 - 0 however it should print the following:
//1 - print Year if the number is divisible by 3
//2 - print Up if the number is divisible by 5
//3 - Print YearUp if the number is divisible by both 3 and 5
    public static void yearUp(){

    for (int x = 45; x >= 0; x--){

        if(x % 3 == 0 && x % 5 == 0){
            System.out.println("Year Up");
        }

        else if(x % 3 == 0){
            System.out.println("Year");
        }
        else if(x % 5 == 0){
            System.out.println("Up");
        }

        else System.out.println(x);
    }

}

    public static void main(String[] args) {

    yearUp();

    }
}
