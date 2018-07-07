package com.gs.serviceproviderdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class TestDemo {


    public static void main (String [] args){
        System.out.println(tableSizeFor(3));
        ArrayList
    }


    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 111111) ? 111111 : n + 1;
    }

}
