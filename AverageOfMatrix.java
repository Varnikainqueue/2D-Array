import java.util.Scanner;
class AverageOfMatrix {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        double average = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum += arr[i][j];
            }
        }
        average = (double) sum/(arr.length * arr[0].length);
        System.out.println("Average of all elements: " + average);
        scn.close();
    }
}



