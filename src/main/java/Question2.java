public class Question2 {
    //Created a method that takes a price and a discount amount
    //Calculate the final price after discounts

    public static double calcutateDisc(int price, double discount){
        double discounted = price-(price + discount);
        double finalPrice = price - discount;
        System.out.println(finalPrice);
        return discounted;
 }

    public static void main(String[] args) {
        System.out.println(calcutateDisc(100,10));


    }
}
