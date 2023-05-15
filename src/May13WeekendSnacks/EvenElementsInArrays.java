package May13WeekendSnacks;

public class EvenElementsInArrays {
    public static int evenNumbersInArrays(int [] array) {
        String numbers = "";

        for (int count = 0; count < array.length; count++) {

            if (array[count] % 2 == 0) {
                numbers += array[count];
            }
        }
        int evenNumbers = Integer.parseInt(numbers);
        return evenNumbers;

    }
    public static void main(String[] args) {
        int sample [] = {1,2,3,4,5,6,7,8,9,10};
        evenNumbersInArrays(sample);
    }
}
