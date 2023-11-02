package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String test = "iiisdoso"; // 4 test
        int[] test2 = parse(test); // 4 test
        for (int r:test2) // 4 test
        System.out.println(r); // 4 test
    }
    public static int[] parse(String data) {
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            switch (data.charAt(i)) {
                case 'i' : count++;
                break;
                case 'd' : count--;
                break;
                case 's' : count*=count;
                break;
                case 'o' : temp.add(count);
                break;
            }
        }
        return temp.stream().mapToInt(i -> i).toArray();
    }
}