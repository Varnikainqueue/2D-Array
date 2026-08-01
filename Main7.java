import java.util.Scanner;
class Main7{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scn.close();
    }
}
