/**
 * Created by rishabh anand on 1/11/2017.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int[][] targetSums = findSums(target);
        for (int[] a: targetSums){
            if (a[0] == a[1]) {
                if (containsDuplicate(nums, a[0])) {
                    int[] indices = getBothIndices(nums, a[0]);
                    answer[0] = indices[0];
                    answer[1] = indices[1];
                    return answer;
                }
            }
            if (contains(nums, a[0]) && contains(nums, a[1])){
                answer[0] = indexOf(nums, a[0]);
                answer[1] = indexOf(nums, a[1]);
                return answer;
            }
        }
        return answer;
    }

    private static int indexOf(int[] a, int n){
        if (!contains(a, n)){
            return -1;
        }
        for (int i = 0; i < a.length; i++){
            if (a[i] == n){
                return i;
            }
        }
        return -1;
    }

    private static boolean contains(int[] a, int n){
        for (int i:a){
            if (i == n){
                return true;
            }
        }
        return false;
    }

    private static boolean containsDuplicate(int[] a, int n) {
        int occurences = 0;
        for (int i: a) {
            if (i == n) {
                occurences += 1;
            }
        }
        return occurences == 2;
    }

    private static int[] getBothIndices(int[] a, int n) {
        int[] indices = {0, 0};
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                indices[index] = i;
                index++;
            }
        }
        return indices;
    }

    private static int[][] findSums(int n){
        if (n == 0){
            int[][] answer = {{0,0}};
            return answer;
        }
        int[][] sums;
        if (n < 0){
            n = -n;
            sums = new int[n/2+1][];
            for (int i = 0; i <= n/2; i++){
                sums[i] = new int[2];
                sums[i][0] = -i;
                sums[i][1] = -(n-i);
            }
        }
        else {
            sums = new int[n/2+1][];
            for (int i = 0; i <= n/2; i++){
                sums[i] = new int[2];
                sums[i][0] = i;
                sums[i][1] = n-i;
            }
        }
        return sums;
    }

    private static void printArray(int[][] a){
        for (int[] i: a){
            printArray(i);
        }
    }

    private static void printArray(int[] a){
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        int[] nums = {3, 3};
        int target = 6;
        printArray(twoSum(nums, target));
        printArray(getBothIndices(nums, 3));
    }
}
