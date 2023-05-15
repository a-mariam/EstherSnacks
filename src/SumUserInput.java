public class SumUserInput {
    public static void main(String[] args) {
        System.out.println(sumUserInput(55643241));
    }
    public static int sumUserInput(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
