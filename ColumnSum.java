import java.util.Scanner;
class ColumnSum{
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

        for(int j=0; j<arr[0].length; j++){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i][j];
                
            }
            System.out.println("Sum of column " + (j+1) + " : " + sum);
        }
        scn.close();
    }
    
}
