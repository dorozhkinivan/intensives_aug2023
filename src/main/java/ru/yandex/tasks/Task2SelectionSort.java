package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int length = numbers.size();
        for(int i = 0; i < length; i++){
            int min = Integer.MAX_VALUE;
            int minInd = -1;
            for(int j = i; j < length; j++){
                if (min > numbers.get(j)){
                    minInd = j;
                    min = numbers.get(j);
                }
            }
            if (i != minInd){
                int t = numbers.get(i);
                numbers.set(i, numbers.get(minInd));
                numbers.set(minInd, t);
            }
        }
        return  numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
