import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rishabh anand on 12/27/2016.
 */
public class LongestPalindromeSubstring {

    /***
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s){
        LinkedList<String> substrings = new LinkedList<>();
        HashSet<String> tested = new HashSet<>();
        substrings.add(s);
        while (!substrings.isEmpty()) {
            String head = substrings.remove();
            tested.remove(head);
            if (isPalindromeIterative(head)) return head;
            String prefix = head.substring(0, head.length()-1);
            String suffix = head.substring(1);
            if (!tested.contains(suffix)){
                substrings.add(suffix);
                tested.add(suffix);
            }
            if (!tested.contains(prefix)){
                substrings.add(prefix);
                tested.add(prefix);
            }
        }
        return "";
    }

    /***
     *
     * @param s
     * @return
     */
    private static boolean isPalindrome(String s){
        StringBuilder temp = new StringBuilder(s).reverse();
        if (temp.toString().equals(s))
            return true;
        return false;
    }

    private static boolean isPalindromeIterative(String s){
        int startIndex = 0;
        int endIndex = s.length()-1;
        while (startIndex <= endIndex){
            if (s.charAt(startIndex) != s.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args){
        String test = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        //String test = "babad";
        long start_time = System.nanoTime();
        String result = longestPalindrome(test);
        long end_time = System.nanoTime();
        double difference = (end_time-start_time)/1e9;

        System.out.println("answer: "+result+" took: "+difference);

    }
}
