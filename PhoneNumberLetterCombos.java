import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rishabh anand on 12/28/2016.
 */
public class PhoneNumberLetterCombos {

    /***
     *
     * @param digits
     * @return
     */
    public static ArrayList<String> letterCombinations(String digits) {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "");
        numbers.put(2, "abc");
        numbers.put(3, "def");
        numbers.put(4, "ghi");
        numbers.put(5, "jkl");
        numbers.put(6, "mno");
        numbers.put(7, "pqrs");
        numbers.put(8, "tuv");
        numbers.put(9, "wxyz");
        numbers.put(0, " ");
        if (digits.length() == 1){
            ArrayList<String> output = new ArrayList<>();
            String s = numbers.get(Integer.parseInt(digits));
            for (int i = 0; i < s.length(); i++){
                output.add("" + s.charAt(i));
            }
            return output;
        }
        else if (digits.length() < 1){
            ArrayList<String> output = new ArrayList<>();
            return output;
        }
        int first = Integer.parseInt("" + digits.charAt(0));
        int second = Integer.parseInt("" + digits.charAt(1));
        ArrayList<String> output = foilTwoStrings(numbers.get(first), numbers.get(second));
        digits = digits.substring(2, digits.length());
        return letterCombinations(digits, output);
    }

    private static ArrayList<String> letterCombinations(String digits, ArrayList<String> output){
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "");
        numbers.put(2, "abc");
        numbers.put(3, "def");
        numbers.put(4, "ghi");
        numbers.put(5, "jkl");
        numbers.put(6, "mno");
        numbers.put(7, "pqrs");
        numbers.put(8, "tuv");
        numbers.put(9, "wxyz");
        numbers.put(0, " ");
        if (digits.equals("")){
            return output;
        }
        else {
            int num = Integer.parseInt("" + digits.charAt(0));
            output = foilListWithString(output, numbers.get(num));
            StringBuilder temp = new StringBuilder(digits);
            temp.deleteCharAt(0);
            digits = temp.toString();
            return letterCombinations(digits, output);
        }
    }

    /***
     *
     * @param a
     * @param b
     * @return
     */
    private static ArrayList<String> foilTwoStrings(String a, String b){
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < a.length(); i++){
            A.add("" + a.charAt(i));
        }
        for (int j = 0; j < b.length(); j++){
            B.add("" + b.charAt(j));
        }
        return foilTwoLists(A, B);
    }

    /***
     *
     * @param A
     * @param b
     * @return
     */
    private static ArrayList<String> foilListWithString(ArrayList<String> A, String b){
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < b.length(); i++){
            B.add("" + b.charAt(i));
        }
        return foilTwoLists(A, B);
    }

    /***
     *
     * @param a
     * @param b
     * @return
     */
    private static ArrayList<String> foilTwoLists(ArrayList<String> a, ArrayList<String> b){
        if (a.size() == 0){
            return b;
        }
        if (b.size() == 0){
            return a;
        }
        ArrayList<String> result = new ArrayList<>();
        for (String i: a){
            StringBuilder s = new StringBuilder();
            s.append(i);
            for (String j: b){
                StringBuilder temp = new StringBuilder(s);
                s.append(j);
                result.add(s.toString());
                s = temp;
            }
        }
        return result;
    }

    /***
     *
     * @param a
     */
    private static void PrintList(ArrayList<String> a){
        for (String i:a){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        PrintList(letterCombinations("30"));
    }
}
