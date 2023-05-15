package May13WeekendSnacks;

public class OddElementsInArray {
    public static int OddNumberInAnArray(int[] array) {
        String collectedNumber = "";

       int oddNumbers = 0;
        for (int count = 0; count < array.length ; count++) {
            if (array[count] % 2 != 0)
                collectedNumber += array[count];
            }
        oddNumbers = Integer.parseInt(collectedNumber);

        System.out.println(oddNumbers);
            return oddNumbers;
        }
    public static void main(String[] args){
    int ara [] = {1,2,3,4,5,6,8,8,9};
OddNumberInAnArray(ara);
        }
}