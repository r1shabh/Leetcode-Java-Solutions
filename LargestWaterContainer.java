
/**
 * Created by rishabh anand on 12/17/2016.
 */
public class LargestWaterContainer {

    public static int maxArea(int[] height){
        int i1 = 0;
        int i2 = height.length-1;
        int maxArea = 0;
        while (i1 < i2){
            int length = Math.min(height[i1], height[i2]);
            int width = Math.abs(i1 - i2);
            int area = length*width;
            if (area > maxArea){
                maxArea = area;
            }
            if (height[i1] > height[i2]){
                i2--;
            }
            else {
                i1++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[] height = {1, 3, 2, 4};
        System.out.println(maxArea(height));
    }
}
