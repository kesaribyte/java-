

import java.util.Arrays;

public class Serach2dQ {
    public static void main(String[] args) {
        int [][] arr = {
         //col  (o   1  2  3  4  5 )
                {2, 3, 4, 5}, //row 0
                {6, 7, 8, 9}, //row 1
                {34, 56},    //row 2
                {111, 45, 56, 67, 90} //row 3
            };
            int target= 111;
            int[] ans = Searach(arr,target);
            System.out.println(Arrays.toString(ans));
            
            System.out.println(max(arr));
    
        }
    
   

    static int[] Searach(int[][] arr, int target){
        for (int row = 0; row < arr.length; row ++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
       
    static int max(int[][] arr){
        int max = Integer.MAX_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 < max){
                   max = element2;
                 }

            }
        }
        return max;
    }
}