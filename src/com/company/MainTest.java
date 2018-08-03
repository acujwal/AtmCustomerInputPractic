package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

 // practic to create method
    public static void main(String[] args) {
    // store data to array list
        List<String > lis = new ArrayList <>();

        // calling method
        practic(lis);

        int x =10;
        int y =20;

        int z = t(x,y);

        System.out.println(z);

    }

    public static void practic(List<String > test){

        test.add("Ujwal");
        test.add("Pratik");

    }

    public static int t(int a, int b){

        return a + b;
    }
}
