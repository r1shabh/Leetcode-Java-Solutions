/**
 * Created by rishabh anand on 1/13/2017.
 */
public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1){
            return true;
        }
        for (int i = nums.length-2; i >= 0; i--){
            if (nums[i] >= (nums.length-1)-i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }
}
