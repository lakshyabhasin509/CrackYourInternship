package RecursionAndBacktracking;
import java.util.ArrayList;

public class PermutationOfString {


        public static void main(String[] args) {
            ArrayList<String> res=perm("","135968");
            System.out.println(res);
            System.out.println(res.size());
        }

        public static ArrayList<String> perm(String p, String in){
            if(in.isEmpty()){
                ArrayList<String> temp=new ArrayList<>();
                temp.add(p);
                return temp;
            }

            char c=in.charAt(0);

            ArrayList<String> res=new ArrayList<>();
            for (int i = 0; i <=p.length() ; i++) {
                String temp=p.substring(0,i)+c+p.substring(i);
                res.addAll(perm(temp,in.substring(1)));
            }
            return res;
        }
    }

