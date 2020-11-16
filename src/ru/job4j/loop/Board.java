package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int index1 = 0; index1 < height; index1++) {
            for (int index2 = 0; index2 < width; index2++ ) {

                if ((index1 + index2) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
