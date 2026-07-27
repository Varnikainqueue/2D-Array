import java.util.Scanner;
class SmallestInMatrix{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int smallest = arr[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j] < smallest){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Smallest Element: " + smallest);
        scn.close();
    }
}

