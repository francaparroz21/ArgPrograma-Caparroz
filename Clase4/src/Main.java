import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 99, 32, 2};
        System.out.println(Arrays.toString(sort(numbers, 'a')));
        System.out.println(Arrays.toString(sort(numbers, 'd')));

    }

    public static int[] sort(int[] numbers, char s) {
        if (s == 'a') return sortAscendente(numbers);
        else if (s == 'd') return sortDescendente(numbers);
        return numbers;
    }

    public static int[] sortAscendente(int[] numbers) {
        int aux;
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = 0; j < numbers.length - 1; j++)
                if (numbers[j + 1] < numbers[j]) {
                    aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
        return numbers;
    }

    public static int[] sortDescendente(int[] numbers) {
        int aux;
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = 0; j < numbers.length - 1; j++)
                if (numbers[j + 1] > numbers[j]) {
                    aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
        return numbers;
    }
}
