import java.util.Scanner;
class Main9{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        boolean identity = true;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(i == j && arr[i][j] != 1)
                    identity = false;

                if(i != j && arr[i][j] != 0)
                    identity = false;
            }
        }

        if(identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");

        scn.close();
    }
}