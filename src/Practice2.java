import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

    /*
    If you want to buy car in this dealership you need to follow the next requirements:
    Ask the price of the user, how much does he expect to bye car.
    If the price less than 40 000$:
    first payment will be 10% of the car's price.
    Your credit score should be 700 points or more.
    Your credit score's age should be  2 years and more.
    If the price more or equal 40 000$:
    first payment will be 20% of the car's price
    Your credit score should be more than 750 points.
- Your credit score's age should be more than 3 years.

     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much many do you want to spent?");
        int userCarP = scanner.nextInt();
        System.out.println("What is your first payment is? ");
        int firstP = scanner.nextInt();
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        System.out.println("What is your credit score age?");
        int creditAge = scanner.nextInt();
        if(userCarP < 40_000 && creditScore>=700 && creditAge>=2 && firstP>=userCarP*0.1) {
            System.out.println("You are approved. Your total is " + userCarP);


        }else if (userCarP >= 40_000 && creditScore>=750 && creditAge>=3 && firstP>=userCarP*0.2){
            System.out.println("You are approved and get 20% off. Your total is " );


        }else{
            System.out.println("Sorry you are not approved!");
        }
}
}
