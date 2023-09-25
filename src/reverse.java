public class reverse {
    public static void main(String[] args) {


       String str = "I Love Java";
       String str1 = "";
       for(int i = str.length()-1; i>=0; ){
           str1+=str.charAt(i);
           i--;
       }
        System.out.println(str1);
        }
    }

