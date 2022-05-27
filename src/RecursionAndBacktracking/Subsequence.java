package RecursionAndBacktracking;

import javax.swing.table.TableStringConverter;
import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println( subseq("","ABC"));
    }

    private static ArrayList<String> subseq(String p, String abc) {
        if(abc.isEmpty()){

            ArrayList<String >temp=new ArrayList<>();
            temp.add(p);
            return temp;
        }
        char ch= abc.charAt(0);
        ArrayList<String> add=subseq(p+ch,abc.substring(1));
        ArrayList<String> skip=subseq(p,abc.substring(1));

        add.addAll(skip);
        return add;
    }
}
