import java.util.Random;
import java.util.Scanner;
public class MatrixUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        while ((number >= 20) || (number <= 0)) {
            System.out.println("Try again.");
            number = input.nextInt();
        }
        System.out.print("number of rows: ");
        int row1 = input.nextInt();
        System.out.print("number of columns: ");
        int column1 = input.nextInt();
        Random random = new Random();
        int upperbound = 20;
        int int_random = random.nextInt(upperbound);

        System.out.println("Matrix Before Transpose:");
        int[][] original = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for(int j = 0; j < column1; j++) {
                original[i][j] = random.nextInt(20);
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix After Transpose:");
        int[][]transpose= new int [row1][column1];
        for (int i=0; i< row1; i++){
            for (int j=0; j< column1; j++){
                transpose[i][j]=original[j][i];
                System.out.print(transpose [i][j]+" ");
            }
            System.out.println();
        }
    }
}



