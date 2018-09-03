package pl.coderstrust.pascal;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(8);
    }


    static void printPascalTriangle(int rows) {

        int[][] triangle = new int[rows][];// tworzymy ilosc wierszy trojkata

        for (int currentRow = 0; currentRow < rows; currentRow++) {
            triangle[currentRow] = new int[currentRow + 1]; // tworzy pusty wiersz

            int firstColumn = 0;
            int lastColumn = triangle[currentRow].length - 1;

            triangle[currentRow][firstColumn] = 1; // wypelnia pierwszy element wiersza
            triangle[currentRow][lastColumn] = 1; // wypelnia ostatni element wiersza

            int currentColumn = 1;
            while ((currentRow > 0) && (currentColumn < lastColumn)) {
                triangle[currentRow][currentColumn] = triangle[currentRow - 1][currentColumn - 1]
                        + triangle[currentRow - 1][currentColumn];
                currentColumn++;
            }
        }

        for (int row = 0; row < rows; row++) {

            int length = triangle[row].length;
            int index = 0;

            int freeSpaces = rows -  row-1;

            while (index < length) {
                while (freeSpaces > 0) {
                    System.out.print(" ");
                    freeSpaces--;
                }
                System.out.print(triangle[row][index] + " ");
                index++;
            }
            System.out.println();
        }

    }

}
