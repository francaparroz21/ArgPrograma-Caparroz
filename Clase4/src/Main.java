import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*haga un main, donde por parámetro ponga 3 números y una letra que
        represente ascendente o descendente y los muestre ordenados por tal criterio
        int[] numbers = new int[]{1, 99, 32, 2};
        System.out.println(Arrays.toString(sort(numbers, 'a')));
        System.out.println(Arrays.toString(sort(numbers, 'd')));*/

        /*
        haga lo mismo, pero solicitando los parámetros de a uno por consola
         */
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros quiere ordenar: ");
        int nNumeros = scr.nextInt();
        int[] numbers = new int[nNumeros];

        for (int i = 0; i < nNumeros; i++) {
            System.out.println("Ingrese un numero: ");
            int n = scr.nextInt();
            numbers[i] = n;
        }

        System.out.println("Ingrese 'a' para ordenar ascendente \n Ingrese 'd' para ordenar descendente");
        String s = scr.next();

        System.out.println(Arrays.toString(sort(numbers, s)));

        /*
        lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
        si no detecta ninguno. Vea si con una función puede evitar repetir código.

        ???????????????????????????????????????????????????????????????????????????
        ejercicio irrelevante

         */

    }

    public static int[] sort(int[] numbers, String s) {
        if(numbers.length == 0)return numbers;
        if (s.equals("a")) return sortAscendente(numbers);
        else if (s.equals("d")) return sortDescendente(numbers);
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
        for (int i = 0; i < numbers.length - 1 ; i++)
            for (int j = 0; j < numbers.length - 1; j++)
                if (numbers[j + 1] > numbers[j]) {
                    aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
        return numbers;
    }
}
