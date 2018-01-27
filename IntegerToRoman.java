/**
 * Created by rishabh anand on 12/20/2016.
 */
public class IntegerToRoman {


    public static String intToRoman(int n, String s){
        if (n == 0){
            return s;
        }
        else{
            StringBuilder result = new StringBuilder(s);
            int a;
            if (n / 1000 > 0){
                a = n / 1000;
                n -= a*1000;
                while (a > 0){
                    result.append('M');
                    a--;
                }
            }
            else if (n / 500 > 0){
                if (n >= 900){
                    n -= 900;
                    result.append("CM");
                    return intToRoman(n, result.toString());
                }
                a = n / 500;
                n -= (a*500);
                while (a > 0){
                    result.append('D');
                    a--;
                }
            }
            else if (n / 100 > 0){
                if (n >= 400){
                    n -= 400;
                    result.append("CD");
                    return intToRoman(n, result.toString());
                }
                a = n / 100;
                n -= (a*100);
                while (a > 0){
                    result.append('C');
                    a--;
                }
            }
            else if (n / 50 > 0){
                if (n >= 90){
                    n -= 90;
                    result.append("XC");
                    return intToRoman(n, result.toString());
                }
                a = n / 50;
                n -= (a*50);
                while (a > 0){
                    result.append('L');
                    a--;
                }
            }
            else if (n / 10 > 0){
                if (n >= 40){
                    n -= 40;
                    result.append("XL");
                    return intToRoman(n, result.toString());
                }
                a = n / 10;
                n -= (a*10);
                while (a > 0){
                    result.append('X');
                    a--;
                }
            }
            else if (n / 5 > 0){
                if (n == 9){
                    result.append("IX");
                    n -= 9;
                    return intToRoman(n, result.toString());
                }
                a = n / 5;
                n -= (a*5);
                while (a > 0){
                    result.append('V');
                    a--;
                }
            }
            else{
                if (n == 4){
                    result.append("IV");
                    n -= 4;
                    return intToRoman(n, result.toString());
                }
                a = n / 1;
                n -= (a*1);
                while (a > 0){
                    result.append('I');
                    a--;
                }
            }
            return intToRoman(n, result.toString());
        }
    }

    public static String intToRoman(int n){
        return intToRoman(n, "");
    }

    public static void main(String[] args){
        System.out.println(intToRoman(14));
    }
}
