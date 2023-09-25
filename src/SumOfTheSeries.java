import java.util.Scanner;

public class SumOfTheSeries {

    public static void main(String[] args) {

            System.out.println("Enter the number of term");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            // n is given above.

            int sum = 0;
            int terms = 1;


            for (int i = 1, a=1; i <= n; i++, a++) {
                sum += terms;
                terms = terms*10 +1;
            }

        System.out.println(sum);

        }
    }

