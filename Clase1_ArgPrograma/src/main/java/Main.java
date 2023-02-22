import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Punto 1
        int startNumber = 5;
        int finishNumber = 14;
        int number = startNumber;

        //A
        while (number <= finishNumber) {
            System.out.println("Number: " + number);
            number++;
        }

        number = startNumber;

        //B
        while (number <= finishNumber) {
            if (number % 2 == 0) System.out.println("Pair number: " + number);
            number++;
        }

        number = startNumber;

        //C
        Scanner input = new Scanner(System.in);
        System.out.println("Enter if you want 'pair' or 'odd' number: ");
        String type = input.next();

        while (number <= finishNumber) {
            switch (type) {
                case "pair":
                    if (number % 2 == 0) System.out.println("Pair number: " + number);
                    break;
                case "odd":
                    if (number % 2 != 0) System.out.println("Odd number: " + number);
                    break;
                default:
                    System.out.println("Incorrect. The only inputs values are 'pair' and 'odd'. ");
                    break;
            }
            number++;
        }

        //D
        for (int i = 14; i > startNumber; i--) {
            if (i % 2 == 0) System.out.println("Pair number: " + i);
        }
    }
}
