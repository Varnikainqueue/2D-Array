import java.util.Scanner;
class Main7{
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

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == 0 || i == arr.length - 1 || j == 0 || j == arr[0].length - 1){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        scn.close();
    }
    
}
