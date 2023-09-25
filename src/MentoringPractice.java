import java.util.Scanner;

public class MentoringPractice {
    public static void main(String[] args) {
        /*The value of the song name has already been assigned using scanner.

        Print the first char of given song name.
        Print the last char of given song name.
        Print the length of the given song name.
        Print the index number of “k” in this song name.
        Print the char from an index number of 3.
        Print the song name in upper case.
        Print the song name in lower case.
        Please do all the printing in the same order listed above and do not add any additional information when printing.
                Example:
        Input: Mockingbird
        Output:
        M
        d
        10
        3
        k
        MOCKINGBIRD
        mockingbird*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite song? ");
        String song = scanner.nextLine();
        String songName = "MOCKINGBIRD";

        System.out.println(songName.charAt(0));
        System.out.println(songName.charAt(song.length()-1));
        System.out.println(songName.length());
        System.out.println(songName.indexOf('K'));
        System.out.println(songName.charAt(3));
        System.out.println(songName.toUpperCase());
        System.out.println(songName.toLowerCase());


       /* Veera wants to lose 10 pounds in one month. There are multiple conditions to lose 10 pounds in a month.
        Veera needs to walk 10000 steps daily OR needs to run at least 4 miles a day and ADDITION to those Veera
        needs to eat less than 1500 calories daily. Create the application that calculate the given parameter
        and will print the true if Veera is able to lose 10 pounds in one month.
        The values for daily steps , daily calories and miles will automatically be inserted on the lines .
        For this exercise calculate the given parameters are enough for losing weight or not.
         If yes, print true, otherwise print false.
        NOTE : No need for using if statement.
        Please look examples carefully.
        Example 1:
        Daily Steps:
        9000
        Daily Miles:
        3.6
        Daily calories:
        2000
        false*/

        int steps = 10_000;
        double miles = 4;
        int calories = 1500;

        System.out.println("How many steps do you do?");
        Scanner input = new Scanner(System.in);
        int step = input.nextInt();
        System.out.println("How many miles do you achieve daily?");
        double mile=input.nextDouble();
        System.out.println("What is your daily calories?");
        int calory=input.nextInt();

        boolean answer = (step>=steps || miles<=mile) && calories>=calory;
        System.out.println("Can you loose your weight? " + answer);



    }
}
