package ru.yandex.tasks;

public class Task11BiggestSubarraySum {

    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int length = numbers.size();
        for(int i = 0; i < length-1; i++){
            boolean changed = false;
            for(int j = i + 1; j < length; j++){
                if (numbers.get(j) < numbers.get(i)){
                    changed = true;
                    int t = numbers.get(j);
                    numbers.set(j, numbers.get(i));
                    numbers.set(i, t);
                }
            }
            if (!changed)
                break;
        }
        return numbers;
    }

    public static void selfCheck() {
        int[] output = {1, 2, -5, 7, -1, 6};
        Subarray ans = find(output);

        assert ans != null;
        assert (ans.left == 3 && ans.right == 6);
    }
}
