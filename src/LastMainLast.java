import java.util.Scanner;

public class LastMainLast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any String");
        String user = scanner.nextLine();

        String lastLetter = user.substring(user.length()-1);
        System.out.println( lastLetter+user+lastLetter);
    // to add last letter from given string take it, save and add
        
    }
}
