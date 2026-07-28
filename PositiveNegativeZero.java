import java.util.Scanner;
class PositiveNegativeZero{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int rows = scn.nextInt();
    int col = scn.nextInt();
    int[][] arr = new int[rows][col];

    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }

    int pos = 0;
    int neg = 0;
    int zero = 0;
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            if(arr[i][j] > 0){
                pos++;
            }
            else if(arr[i][j] < 0){
                neg++;
            }
            else{
                zero++;
            }
        }
    }

     System.out.println("Positive Count: " + pos);
        System.out.println("Negative Count: " + neg);
        System.out.println("Zero Count: " + zero);

        scn.close();
    }
}


