import java.util.Scanner;
class Main10{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        boolean symmetric = true;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(arr[i][j] != arr[j][i])
                    symmetric = false;
            }
        }

        if(symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not a Symmetric Matrix");

        scn.close();
    }
}