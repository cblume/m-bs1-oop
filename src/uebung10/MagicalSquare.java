package uebung10;

import acm.program.ConsoleProgram;

public class MagicalSquare extends ConsoleProgram {

    private int[][] MAGICAL_THREE_BY_THREE = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
    };

    public void run() {
//        println("This program evaluates whether the square you've entered is a magical square.");
//        println("The smallest possible square is 3x3.")
//        println("Please enter the int values row by row separated by spaces.");
//        println();
//
//        boolean exit = false;
//        int rowCount = 0;
//        ArrayList<Integer[]> square = new ArrayList<Integer[]>();
//
//        while (!exit) {
//            String input = readLine("> Please enter the input for row " + ++rowCount + " or submit a blank row to exit: ");
//
//            if (input.equalsIgnoreCase("exit")) {
//                println("Goodbye!");
//                exit = true;
//            }
//            else {
//                String[] splitInput = input.split(" ");
//            }
//        }
        println(checkSquareForMagicalProperties(MAGICAL_THREE_BY_THREE));
    }

    private boolean checkSquareForMagicalProperties(int[][] magicalSquare) {
        int rowSum = checkRows(magicalSquare);
        int colSum = checkColumns(magicalSquare);
        int diagSum = checkDiagonals(magicalSquare);

        return rowSum == colSum && rowSum == diagSum;
    }

    private int checkRows(int[][] magicalSquare) {
        int rowSum = 0;
        for (int i = 0; i < magicalSquare.length; i++) {
            int sum = 0;
            for (int j = 0; j < magicalSquare[i].length; j++) {
                sum += magicalSquare[i][j];
            }

            if (i == 0) {
                rowSum = sum;
            }
            else if (sum != rowSum) {
                return -1;
            }
        }
        return rowSum;
    }

    private int checkColumns(int[][] magicalSquare) {
        int colSum = 0;
        for (int i = 0; i < magicalSquare.length; i++) {
            int sum = 0;
            for (int j = 0; j < magicalSquare[i].length; j++) {
                sum += magicalSquare[j][i];
            }

            if (i == 0) {
                colSum = sum;
            }
            else if (sum != colSum) {
                return -1;
            }
        }
        return colSum;
    }

    private int checkDiagonals(int[][] magicalSquare) {
        int leftDiagSum = 0;
        int rightDiagSum = 0;

        for (int i = 0; i < magicalSquare.length; i++) {
            leftDiagSum += magicalSquare[i][i];
            rightDiagSum += magicalSquare[i][magicalSquare.length - (1 + i)];
        }

        return leftDiagSum == rightDiagSum ? leftDiagSum : -1;
    }
}
