package com.tjw;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("9");
        List list = new ArrayList();
        Long count = 0l ;
        for (int i = 0; i < 9; i++) {
            long s = Long.valueOf(String.valueOf(x));
            count += s ;
            x.append("9");
        }

        System.out.println(count);
    }
}
