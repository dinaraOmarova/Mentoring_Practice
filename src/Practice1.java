public class Practice1 {
    public static void main(String[] args) {


        int car = 10;
          //         10       11        13      12      13
        int sellCar= car++ + car++ + ++car + --car - ++car  - 2;
        System.out.println(sellCar);
       // ++a; (right away)
       // a++; (will at nex usage)


        int c = 15;
        int d= 5;
        int cd =  c++ + 2 + --d + 10 - d-- + 8 + --c;
        System.out.println(cd);
        //              9        11
        int z=3, x= --z +7, y= x++ + z--;
        --z;
        System.out.println(z);  //0
        //      10    11
        int q = x + y*4 - 14 / 7;
        System.out.println("Q = " + q); //52



    }
}
