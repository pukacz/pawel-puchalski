package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(11);
    }

    static void printChristmasTree(int size) {
        boolean isTree = false;
        int freeSpacesOnRoot = 0;
        int starsOnLevel = 1;

        if (size > 0) {
            isTree = true;
            freeSpacesOnRoot = size - 2;
        }


        while (size > 0) {

            int freeSpacesOnLevel = size - 1;

            while (freeSpacesOnLevel > 0) {
                System.out.print(" ");
                freeSpacesOnLevel--;
            }

            for (int i = 0; i < starsOnLevel; i++) {
                System.out.print("*");
            }
            System.out.println();
            starsOnLevel = starsOnLevel + 2;
            size--;

            if ((size == 0) && (isTree)) {
                for (int i = 0; i < freeSpacesOnRoot; i++) {
                    System.out.print(" ");
                }
                System.out.println("**");
            }
        }

    }
}