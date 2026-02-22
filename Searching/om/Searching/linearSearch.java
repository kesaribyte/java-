package Searching;

public class linearSearch{

    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 87};
        int target = 45;

        int ans = linearSearach(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

    static int linearSearach(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target) {
                return index;
            }
        }

        // if target not found
        return -1;
    }
}
