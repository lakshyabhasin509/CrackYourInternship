package com.DSA.stack;

import java.util.Stack;

public class InfixtoPostfix {
    public static void main(String[] args) {

        InfixtoPostfix ob=new InfixtoPostfix();
        System.out.println(ob.convert("a+b*c-d/e"));
    }
    String convert(String exp){
        Stack<Character> s=new Stack<Character>();
        StringBuilder st= new StringBuilder();
        int i=0;

        while(i<exp.length())
        {
            char ch=exp.charAt(i);
            if(isOperand(ch))
            {  st.append(ch);
                i++;}
            else
            {
                if(pre(ch)>pre(s.peek()))
                {
                    s.push(ch);
                    i++;
                }
                else
                    st.append(s.pop());
            }
        }

        return st.toString();
    }
   boolean isOperand(char ch){
        if(ch=='+'||ch=='/'||ch=='*'||ch=='-')return true;
        else return false;
    }
    int pre(char ch){
        if(ch=='+'||ch=='-')return 1;

        if(ch=='*'||ch=='/')return 2;
        return -1;
    }
}
