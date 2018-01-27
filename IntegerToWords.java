/**
 * Created by rishabh anand on 12/20/2016.
 */
public class IntegerToWords {

    static String[] singles = {"zero", "one", "two", "three", "four", "five",
    "six", "seven", "eight", "nine"};
    static String[] tens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen",
    "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] suffixes = {"hundred", "thousand", "million"};
    static String[] doubles = {"ten", "twenty", "thirty", "forty", "fifty",
    "sixty", "seventy", "eighty", "ninety"};

    /***
     *
     * @param n
     * @param s
     * @return
     */
    public static String numberToWords(int n, String s){
        StringBuilder result = new StringBuilder(s);
        if (n == 0){
            if (s.equals(" ")){
                return "zero";
            }
            return s.toString();
        }
        else {
            int first = Integer.parseInt(String.valueOf(("" + n).charAt(0)));
            if (n >= 1000){
                result.append(singles[first]);
                result.append(" ");
                result.append(suffixes[1]);
                n -= first * 1000;
            }
            else if (n >= 100){
                result.append(singles[first]);
                result.append(" ");
                result.append(suffixes[0]);
                n -= first * 100;
            }
            else if (n >= 20 || n == 10){
                result.append(doubles[first-1]);
                n -= first * 10;
            }
            else if (n > 10){
                int onesDigit = Integer.parseInt(String.valueOf(("" + n).charAt(1)));
                result.append(tens[onesDigit-1]);
                n = 0;
            }
            else {
                result.append(singles[first]);
                n -= first;
            }
            if (n > 0){
                result.append(" ");
            }
            return numberToWords(n, result.toString());
        }
    }

    /***
     *
     * @param n
     * @return
     */
    public static String numberToWords(int n){
        return numberToWords(n, "");
    }

    public static void main(String[] args){
        System.out.println(numberToWords(2220));
    }
}
