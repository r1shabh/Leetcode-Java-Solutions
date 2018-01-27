/**
 * Created by rishabh anand on 1/10/2017.
 */
public class AddInBinary {
    public static String addBinary(String a, String b) {
        StringBuilder A = new StringBuilder(a).reverse();
        StringBuilder B = new StringBuilder(b).reverse();
        if (A.length() < B.length()){
            while (A.length() < B.length()){
                A.append('0');
            }
        }
        else if (B.length() < A.length()){
            while (B.length() < A.length()){
                B.append('0');
            }
        }
        StringBuilder finalSum = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < A.length(); i++){
            int sum = carry + Integer.parseInt(""+A.charAt(i)) + Integer.parseInt(""+B.charAt(i));
            carry = 0;
            while (sum >= 2){
                sum -= 2;
                carry++;
            }
            finalSum.append(sum);
        }
        finalSum.append(carry);
        while (finalSum.charAt(finalSum.length()-1) == '0' && finalSum.length() > 1){
            finalSum.deleteCharAt(finalSum.length()-1);
        }
        return finalSum.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(addBinary("11", "11"));
    }
}
