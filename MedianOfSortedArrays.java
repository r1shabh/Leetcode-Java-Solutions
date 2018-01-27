/**
 * Created by rishabh anand on 1/6/2017.
 */
public class MedianOfSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0){
            return Double.NaN;
        }
        else {
            int[] merged = mergeTwoSortedArrays(nums1, nums2);
            return MedianOfSortedArray(merged);
        }
    }

    private static double MedianOfSortedArray(int[] nums){
        if (nums.length % 2 != 0){
            return nums[nums.length/2] * 1.0;
        }
        else {
            return (nums[nums.length/2-1] + nums[nums.length/2])/2.0;
        }
    }

    private static int[] mergeTwoSortedArrays(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length + nums2.length];
        int nums1Index, nums2Index, resultIndex;
        nums1Index = nums2Index = resultIndex = 0;
        while (nums1Index < nums1.length && nums2Index < nums2.length){
            if (nums1[nums1Index] <= nums2[nums2Index]){
                result[resultIndex] = nums1[nums1Index];
                nums1Index++;
            }
            else {
                result[resultIndex] = nums2[nums2Index];
                nums2Index++;
            }
            resultIndex++;
        }
        if (nums1Index < nums1.length){
            while (nums1Index < nums1.length){
                result[resultIndex] = nums1[nums1Index];
                resultIndex++;
                nums1Index++;
            }
        }
        if (nums2Index < nums2.length){
            while (nums2Index < nums2.length){
                result[resultIndex] = nums2[nums2Index];
                resultIndex++;
                nums2Index++;
            }
        }
        return result;
    }

    private static void printArray(int[] nums){
        for (int i: nums){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        int[] a = {1, 1};
        int[] b = {1, 2};
        System.out.println(findMedianSortedArrays(a, b));
    }
}

