public class Point1 {

    public int getRepeatedLetterCount(String text, char letter) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (letter == text.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public int[] sortNumbers(int[] numbers) {
        int aux;
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = 0; j < numbers.length - i - 1; j++)
                //Segun como lo quisieramos ordenar, cambiariamos el < por > y viceversa.
                if (numbers[j + 1] < numbers[j]) {
                    aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
        return numbers;
    }

    public int greatestNumberSum(int[] numbers, int number) {
        int count = 0;
        for (int n : numbers) {
            if (n > number)count+=n;
        }
        return count;
    }
}
