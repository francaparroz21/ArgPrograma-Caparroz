import java.awt.*;

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

        public static List sortNumbers(List numbers){
            return numbers;
        }
}