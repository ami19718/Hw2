public class Question5 {
//Write a while loop that prints only even numbers from 10 - 0 but once the loop gets to 5 break out of the loop

    public static void main(String[] args) {

       int i = 10;
        while ( i >= 0 ){
        if(i == 5){
                break;
        }
        else if(i % 2 == 0){
            System.out.println(i);}
i--;


        }
    }}
