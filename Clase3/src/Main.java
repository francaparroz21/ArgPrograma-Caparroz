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

        /*
        A - Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        el String

        getRepeatedLetterCount

         */

        //oso polar | 'o'
        //expected: 3
        System.out.println("Count: " + getRepeatedLetterCount("oso polar",'o'));


        /*
        Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3

        sortNumbers
        */

        //1,6,4,2,7,18,999
        //expected: 1,2,4,6,7,18,999
        int[] numbers = new int[]{1,6,4,2,7,18,999};
        System.out.println(Arrays.toString(sortNumbers(numbers)));

        /*
        2 -Genere una clase que tenga los métodos para realizar la codificación y decodificación
        de un string, dado un número de desplazamiento.
         */

        Point2 p2 = new Point2();
        //expected: ipmbarvfaubm
        System.out.println(p2.decodify1("hola que tal"));
    }
        public static int getRepeatedLetterCount(String text, char letter){
            int count = 0;
            for (int i = 0; i<text.length();i++){
                if (letter == text.charAt(i)){
                    count++;
                }
            }
            return count;
        }

        public static int[] sortNumbers(int[] numbers){
            int aux;
            for(int i = 0; i < numbers.length-1; i++)
                for(int j=0; j < numbers.length-i-1; j++)
                    //Segun como lo quisieramos ordenar, cambiariamos el < por > y viceversa.
                    if(numbers[j+1] < numbers[j]){
                        aux = numbers[j+1];
                        numbers[j+1] = numbers[j];
                        numbers[j] = aux;
                    }
            return numbers;
        }
}