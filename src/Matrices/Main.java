package com.DSA.Matrices;

public class Main {
    public static void main(String[] args) {
        SymmetricMatrix m1=new SymmetricMatrix(3);
        m1.set(1,1,17);
        m1.set(1,2,10);
        m1.set(1,3,1);
        m1.set(2,2,51);
        m1.set(2,3,12);
        m1.set(3,3,32)
        ;

        m1.display();
    }
}
