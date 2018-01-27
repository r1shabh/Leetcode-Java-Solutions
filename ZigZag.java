/**
 * Created by rishabh anand on 11/19/2016.
 */
public class ZigZag {

    static String convert(String text, int numRows){
        if (numRows == 1){
            return text;
        }
        StringBuilder[] zigPattern = new StringBuilder[numRows];
        for (int i = 0; i < zigPattern.length; i++){
            zigPattern[i] = new StringBuilder("");
        }
        int count = 0;
        boolean countDown = false;
        for (int x = 0; x < text.length(); x++){
            zigPattern[count].append(text.charAt(x));
            if (!countDown){
                count++;
            }
            else {
                count--;
            }
            if (count == numRows-1){
                countDown = true;
            }
            else if (count == 0){
                countDown = false;
            }
        }
        StringBuilder answer = new StringBuilder("");
        for (StringBuilder s:zigPattern){
            answer.append(s);
        }
        return answer.toString();
    }

    public static void main(String[] args){
        System.out.println(convert("ab", 1));
    }
}
