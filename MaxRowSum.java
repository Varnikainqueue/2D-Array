import java.util.Scanner;
class MaxRowSum{
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

       int max = 0;
        for(int i=0; i<arr.length; i++){
             int sum = 0;
             
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }

            if(sum > max){
                    max = sum;
                }
        }

        System.out.println("Maximum Row Sum = " + max);
        scn.close();
    }
}