import java.util.Scanner;
class Main6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i+j == arr.length -1){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);

        scn.close();

    }
    
}
