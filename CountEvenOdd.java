import java.util.Scanner;
class CountEvenOdd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int even = 0;
        int odd = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j]%2 ==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
        scn.close();
    }
}
