import java.util.Locale;

public class FindSecondMatchingString {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "kiwi", "mango", "Apple", "melon", "Apple"};
        int count = 1;
        String result = "";
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {
                    count++;
                   if(count ==2){
                       System.out.println(j);

                   }

                }
            }
        }
    }
}
