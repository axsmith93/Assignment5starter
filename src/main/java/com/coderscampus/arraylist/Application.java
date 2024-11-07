package com.coderscampus.arraylist;

import com.coderscampus.arraylist.CustomArrayList;

public class Application {
    public static void main(String[] args) {
        CustomArrayList<Object> numbers = new CustomArrayList<>();
        int i;
        for (i = 1; i <= 40; ++i) {
            numbers.add(i);
        }
        for (i = 0; i < numbers.getSize(); ++i) {
            System.out.println(numbers.get(i));
        }
        System.out.println(numbers.getSize());
        System.out.println(numbers.get(numbers.getSize()  - 1));
    }
}
