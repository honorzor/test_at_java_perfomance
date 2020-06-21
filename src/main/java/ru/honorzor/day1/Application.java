package ru.honorzor.day1;

public class Application {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sumDouble(2, 2));
        System.out.println(altPairs("CodingHorror"));

    }


    public static boolean sleepIn(boolean a, boolean b) {
        if (!a && !b) return true;
        return !a || b;
    }


    public static int sumDouble(int a, int b) {
        return a == b ? a * a + b * b : a + b;
    }

    public static String altPairs(String str) {
        char[] word = str.trim().replace(" ", "").toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int k = 1;
        int step = 4;
        for (int i = 0; i < word.length; i = i + step) {
            stringBuilder.append(word[i]);
            if (i + k != word.length) stringBuilder.append(word[i + 1]);
            else break;
        }
        return String.valueOf(stringBuilder);
    }

}
