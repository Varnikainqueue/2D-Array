import java.util.Scanner;
class Main11{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];

        int zero = 0;
        int nonZero = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = scn.nextInt();

                if(arr[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if(zero > nonZero)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");

        scn.close();
    }
}