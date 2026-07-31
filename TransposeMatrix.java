import java.util.Scanner;
class TransposeMatrix{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] transpose = new int[col][row];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        
        scn.close();
    }
    
}
