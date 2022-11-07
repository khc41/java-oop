package com.java.javaoop;

import com.java.javaoop.logic.BubbleSort;
import com.java.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}

