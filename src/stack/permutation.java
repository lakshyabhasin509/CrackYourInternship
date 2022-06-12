package com.DSA.stack;

import java.util.Locale;

public class permutation {
    public static void main(String[] args) {
permutation("","abc");
    }
    static void permutation(String pr,String up){
        if(up.isEmpty()){
            System.out.println(pr);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=pr.length() ; i++) {
            String first=pr.substring(0,i);
            String sec=pr.substring(i,pr.length());
            permutation(first+ch+sec,up.substring(1));
        }

    }
}
