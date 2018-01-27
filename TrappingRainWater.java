/**
 * Created by rishabh anand on 12/18/2016.
 */
public class TrappingRainWater {

    public static int trap(int[] height){
        int leftEnd = 0;
        int rightEnd = height.length-1;
        while (leftEnd == 0){
            leftEnd++;
        }
        while (rightEnd == 0){
            rightEnd--;
        }
        int area = 0;
        while (leftEnd < rightEnd) {
            int temp = leftEnd + 1;
            int tempEnd = leftEnd+1;
            while (height[tempEnd] < height[leftEnd]){
                if (tempEnd==rightEnd){
                    break;
                }
                tempEnd++;
            }
            while (temp < tempEnd){
                area += height[leftEnd] - height[temp];
                temp++;
            }
            leftEnd = temp;
        }
        return area;
    }

    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
