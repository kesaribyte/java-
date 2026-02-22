package Searching;

public class MaxWealth {

    public static void main(String[] args) {

        int [][] arr = {
            {2,345},
            {65,3}
        };

        
        MaxWealth obj = new MaxWealth();
        int answer = obj.MaxWealth1(arr);
        System.out.println(answer);
    }

    public int MaxWealth1(int[][] accounts ){

        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            // when you start a new row, take a new sum for that row

            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans){
                ans = sum;
            }
        }

        return ans;
    }
}