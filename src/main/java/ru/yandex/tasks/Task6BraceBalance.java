package ru.yandex.tasks;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        char[] charSequence = sequence.toCharArray();
        Stack<Character> open = new Stack<>();
        for(char c : charSequence){
            if (c == '{' || c == '(' || c == '['){
                open.push(c);
            }
            else {
                if (open.isEmpty())
                    return false;
                char opened = open.pop();
                if (!((c == '}' && opened == '{') || (c == ')' && opened == '(') || (c == ']' && opened == '['))){
                    return false;
                }
            }
        }
        return open.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
