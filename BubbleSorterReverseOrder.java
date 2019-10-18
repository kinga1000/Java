import java.util.Arrays;
public class BubbleSorterReverseOrder {
    public static void main(String[] args) {
        int[] numbers= {1,6,8,2,4,5};
        boolean isSorted=true;
        int i=0;
            do{isSorted=true;
                for(int j=1; j<numbers.length-i; j++) {
                    if (numbers[j - 1] < numbers[j]) {
                        int temp = numbers[j - 1];
                        numbers[j - 1] = numbers[j];
                        numbers[j] = temp;
                        isSorted = false;
                    }


                }
                i++;
        } while (!isSorted);
            System.out.println(Arrays.toString(numbers));

}}