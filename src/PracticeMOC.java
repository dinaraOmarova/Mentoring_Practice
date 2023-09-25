public class PracticeMOC {
    public static void main(String[] args) {


        int[] array = {45,78,20,34,66,25,90};

        int largest = array[0];
        int secondLargest=0;
        int smallest=0;

        for(int i = 0; i < array.length; i++){

            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            } else if(array[i]> secondLargest && array[i] !=largest){
                secondLargest = array[i];
            } else if (secondLargest<array[i] ) {
                smallest=secondLargest;
                smallest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(smallest);


    }
}
