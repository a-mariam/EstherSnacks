public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        int multiplication = 0;
        for (int count = 1; count <= 12; count++) {
            for (int number = 1; number <= 12; number++) {
                multiplication = count * number;
                System.out.printf("%d\t" , multiplication);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Reversed Multiplication Table");
        int times = 0;
        for(int count = 1; count <= 12;count++ ) {
                for (int number = 12; number >= 1; number--) {
                    times = count * number;
                    System.out.printf("%d\t", times);
                }
                System.out.println("");
            }
        }
    }
