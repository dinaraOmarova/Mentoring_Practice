public class Practice3 {
    public static void main(String[] args) {

        int a = 5;
        int mult = 1;
        while (mult <= 10) {
            System.out.println(" " + a + "*" + mult + " = " + (a * mult));

            mult++;
        }


        String str = "Today is Monday";
        System.out.println(str.trim());
        System.out.println(str.replace(" ", ""));
        str = (str.replace("is", "")).replace("Mon", "Sun");
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(str.indexOf('d')));
        System.out.println(str.charAt(9));

        String str1 = "civic";

        for (int i = 0, j = (str1.length() - 1); i < str1.length() && j < str1.length(); i++, j--) {
            if (str1.charAt(i) == str1.charAt(j)) {

        }
        }
        System.out.println(" This word is Polyandrous");




        String word = "Saturday";
        word= word.toLowerCase();
        int ind =word.length();
       while(ind > 0){
           ind--;
       }
        System.out.println(word);

       String str0 = "Saturday";
       String str01 = "";
       for (  int i = str0.length()-1 ; i>= 0 ; ){

           str01 += str0.charAt(i);
         i--;

       }  System.out.println(str01);


    }
}
