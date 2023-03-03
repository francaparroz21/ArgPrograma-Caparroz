import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        1 - Utilizando solo tipos primitivos, String (solo usar método length), vectores,
                iteraciones simples y condicionales, genere una clase por ejercicio que posea los
        siguientes métodos:
         */

        Point1 p1 = new Point1();

        /*
        A - Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        el String

        getRepeatedLetterCount

         */

        //oso polar | 'o'
        //expected: 3
        System.out.println("Count: " + p1.getRepeatedLetterCount("oso polar", 'o'));


        /*
        B - Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3

        sortNumbers
        */

        //1,6,4,2,7,18,999
        //expected: 1,2,4,6,7,18,999
        int[] numbers = new int[]{1, 6, 4, 99, 2, 7, 18, 999};
        System.out.println(Arrays.toString(p1.sortNumbers(numbers)));

        /*
        c. dado un vector de números, y un número X, que sume todos los números > X y
        retorne el resultado

         */
        //Expected: 31
        int[] numbersSum = new int[]{1, 6, 4, 2, 7, 18};
        System.out.println(p1.greatestNumberSum(numbersSum, 4));

        /*
        2 -Genere una clase que tenga los métodos para realizar la codificación y decodificación
        de un string, dado un número de desplazamiento.
         */

        Point2 p2 = new Point2();
        //expected: ipmbarvfaubm
        System.out.println(p2.decodify1("hola que tal"));
        //expected: “jqncbswgbvcn”
        System.out.println(p2.decodify2(("hola que tal")));
    }
}