
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] values) {
        for (int[] row: values) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] values) {
        int sum = 0;
        for (int[] row: values) {
            for (int cell: row) {
                sum += cell;
            }
        }

        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] values) {
        int s = sum(values);
        return (double) s / (values.length * values.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] values) {
        int min = values[0][0];

        for (int[] row: values) {
            for (int cell: row) {
                if (cell < min) {
                    min = cell;
                }
            }
        }

        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] values) {
        int max = values[0][0];

        for (int[] row: values) {
            for (int cell: row) {
                if (cell > max) {
                    max = cell;
                }
            }
        }

        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] values) {
        int evenCount = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }

        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] values) {
        int evenCount = 0;

        for (int[] row: values) {
            for (int cell: row) {
                if (cell % 2 == 0) {
                    evenCount++;
                }
            }
        }

        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] values) {
        for (int[] row: values) {
            for (int cell: row) {
                if (cell <= 0) {
                    return false;
                }
            }
        }

        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] values) {
        int[] rowSum = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            for (int cell: values[i]) {
                rowSum[i] += cell;
            }
        }

        return rowSum;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] values) {
        int[] colSum = new int[values.length];
        for (int[] row : values) {
            for (int j = 0; j < row.length; j++) {
                colSum[j] += row[j];
            }
        }

        return colSum;
    }
}