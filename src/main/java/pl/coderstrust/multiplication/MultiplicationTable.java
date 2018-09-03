package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(11);
    }


    static void printMultiplicationTable(int size) {
        if (size > 0) {

            int tableRow0[] = new int[size];
            int index = 0;

            while (index < size) {
                tableRow0[index] = index + 1;
                index++;
            }

            int tableRowN[][] = new int[size][size]; //creating nSize table of nSize tables

            int currentRow = 0;

            while (currentRow < size) {
                int currentColumn = 0;
                tableRowN[currentRow] = new int[size];
                while (currentColumn < size) {
                    tableRowN[currentRow][currentColumn] = tableRow0[currentColumn] * (currentRow + 1);
                    currentColumn++;
                }
                currentRow++;
            }

            int row = -1;

            while (row < size) {
                int column = -1;


                if (row < 0) {//printing horizontal multiplier
                    while (column < size) {
                        if (column == -1) {
                            System.out.print("\t");
                        } else {
                            System.out.print(tableRow0[column] + "\t");
                        }

                        column++;
                    }
                    row = 0;
                    System.out.println();
                }

                column = -1;
                while (column < size) {
                    if (column == -1) {//printing vertical multiplier
                        System.out.print(row + 1 + "\t");
                        column = 0;
                    }
                    System.out.print(tableRowN[row][column] + "\t");
                    column++;
                }
                System.out.println();
                row++;
            }

        }
    }
}
