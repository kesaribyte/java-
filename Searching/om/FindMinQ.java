

public class FindMinQ {
    public static void main(String[] args) {
        int[] arr = {12, 34, -56, 10, 32, 34};
        System.out.println(min(arr));
    }


    // assume arr.length !=1
    // return the min value in the array
    static int min(int[]arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
       
        return ans;
    
    }
}
