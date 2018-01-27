import java.util.ArrayList;

/**
 * Created by rishabh anand on 1/4/2017.
 */
public class SetOperations {

    private static int numOfSubsets(ArrayList<Integer> a){
        return 2^a.size();
    }

    private static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> smallerSet;
        ArrayList<Integer> largerSet;
        if (a.size() >= b.size()){
            largerSet = a;
            smallerSet = b;
        }
        else {
            largerSet = b;
            smallerSet = a;
        }
        for (int i: smallerSet){
            result.add(i);
        }
        for (int j: largerSet){
            if (!result.contains(j))
                result.add(j);
        }
        return result;
    }

    private static ArrayList<Integer> intersect(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<>();

        return result;
    }

    private static ArrayList<Integer> difference(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<>();

        return result;
    }

    private static boolean equalSubsets(ArrayList<Integer> a, ArrayList<Integer> b){
        if (a.size() != b.size()){
            return false;
        }
        else {
            for (int i = 0; i < a.size(); i++){
                if (a.get(i) != b.get(i))
                    return false;
            }
            return true;
        }
    }

    private static boolean isSubset(ArrayList<Integer> a, ArrayList<Integer> b){
        boolean isSubset = true;
        ArrayList<Integer> smallerSet;
        ArrayList<Integer> largerSet;
        if (a.size() >= b.size()){
            smallerSet = b;
            largerSet = a;
        }
        else{
            smallerSet = a;
            largerSet = b;
        }
        for (int i = 0; i < smallerSet.size(); i++){
            if (!largerSet.contains(smallerSet.get(i))){
                return false;
            }
        }
        return isSubset;
    }

    private static void printList(ArrayList<Integer> a){
        for (int i: a){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){

    }
}
