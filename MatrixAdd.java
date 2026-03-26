import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, c;

        
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        
        if (r != 2 || c != 2) {
            System.out.println("This program works only for 2x2 matrices.");
            return;
        }

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

       
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        
        System.out.println("First Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("Second Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("Matrix Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

