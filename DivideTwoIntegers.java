/**
 * Created by rishabh anand on 1/9/2017.
 */
public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0){
            return Integer.MAX_VALUE;
        }
        if (dividend < 0 && divisor < 0){

        }
        else if (dividend < 0 || divisor < 0){

        }
        else {

        }
        return 3;
    }

    private static int shiftLeft(int i){
        int result;
        StringBuilder temp = new StringBuilder("" + i);
        temp.append('0');
        result = Integer.parseInt(temp.toString());
        return result;
    }

    private static int shiftRight(int i){
        int result;
        StringBuilder temp = new StringBuilder("" + i);
        temp.deleteCharAt(temp.length()-1);
        result = Integer.parseInt(temp.toString());
        return result;
    }

    public static void main(String[] args){
        System.out.println(shiftLeft(33));
        System.out.println(shiftRight(33));
    }
}
