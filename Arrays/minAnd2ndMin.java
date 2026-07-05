import java.util.*;

class Solution {

    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // Find first smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                first = arr[i];
            }
        }

        // Find second smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first && arr[i] < second) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            ans.add(-1);
        } else {
            ans.add(first);
            ans.add(second);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};

        Solution obj = new Solution();     // Create object
        ArrayList<Integer> result = obj.minAnd2ndMin(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}