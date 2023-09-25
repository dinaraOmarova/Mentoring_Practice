public class Interview {
    public static void main(String[] args) {

       String word = "I     love   Java";
     while( word.contains("  ")){

         word = word.replace("  ", " ");

       }
        System.out.println(word);

    }
}
