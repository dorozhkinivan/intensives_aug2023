package ru.yandex.tasks;

import java.util.Arrays;

public class Task5BFS {
    
    static Queue<Integer> toCompute = new LinkedList<>();

    static List<Integer> answer = new LinkedList<>();

    public static void runSearch(int[][] tree, int root) {
        toCompute.add(root);
        /*
         * Реализация bfs
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        while(!toCompute.isEmpty()){
            root = toCompute.poll();
            if (tree[root][0] != -1) {
                toCompute.add(tree[root][0]);
            }
            if (tree[root][1] != -1) {
                toCompute.add(tree[root][1]);
            }
            answer.add(root);

        }
    }

    public static int[] getBFSOrder(int[][] tree, int root) {
        /*
         * Функция возвращает массив с порядковыми номерами вершин в обходе
         * Дано дерево из n (<= 10^5) вершин (пронумерованных от 0 до n-1)
         * tree - двумерный массив, tree[i][0] - номер левого сына, tree[i][1] - номер правого сына (если нет левого / правого сына, соотв. элемент -1).
         * root - корень, откуда нужно начинать обход
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        toCompute.clear();
        answer.clear();
        runSearch(tree, root);
        int[] ans = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++)
            ans[i] = answer.get(i);
        return ans;
    }

    public static void selfCheck() {
        int[][] tree =
                {
                        {1, 6},
                        {2, 3},
                        {-1, -1},
                        {4, -1},
                        {-1, -1},
                        {-1, -1},
                        {-1, 8},
                        {-1, -1},
                        {-1, -1}
                };

        int[] ans1 = {0, 1, 6, 2, 3, 8, 4};
        int[] ans2 = {3, 4};
        int[] ans3 = {2};
        int[] ans4 = {6, 8};

        assert (Arrays.equals(getBFSOrder(tree, 0), ans1));
        assert (Arrays.equals(getBFSOrder(tree, 3), ans2));
        assert (Arrays.equals(getBFSOrder(tree, 2), ans3));
        assert (Arrays.equals(getBFSOrder(tree, 6), ans4));
    }
}
