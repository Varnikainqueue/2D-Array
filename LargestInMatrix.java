import java.util.Scanner;
class LargestInMatrix{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int largest = arr[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element: " + largest);
        scn.close();
    }
}


