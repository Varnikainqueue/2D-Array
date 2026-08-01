import java.util.Scanner;
class Main8{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum = new int[row][col];

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}