package com.imugen;

import java.util.*;
class Main {
    public static void main(String args[]) throws Exception {
//        Map map = System.getProperties();
//        Random rnd = new Random();
//        while (true) {
//            map.put(rnd.nextInt(), "val");
//        }
        Map map = System.getProperties();
        Random rnd = new Random();
        while (true) {
            map.put(rnd.nextInt(), "val");
        }
    }
}