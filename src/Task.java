import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        ArrayList number = new ArrayList<>();
        ArrayList number1 = new ArrayList<>();
        ArrayList number2 = new ArrayList<>();
        ArrayList number3 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            number.add(i);
        }
            for (int i = 0; i <number.size(); i++) {

                if ((i % 3 == 0) && (i % 5 == 0)) {
                    number1.add(i);
                } else if (i % 5 == 0) {
                    number2.add(i);
                } else if (i % 3 == 0) {
                    number3.add(i);

                }
            }

            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);
        }
    }




