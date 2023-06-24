package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> arr = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        List<String> rightAnswers = new ArrayList<>();
        List<String> allAnswers = new ArrayList<>();
        arr.add("Qqwertyu");
        arr.add("adsaad");
        arr.add("ss");
        arr.add("Qqwertyu");

        allAnswers.add("a.Qqwertyu");
        allAnswers.add("b.Qqwertyu");
        allAnswers.add("c.Qqwertyu");
        allAnswers.add("d.Qqwertyu");


        answers.add("a");
        answers.add("a");
        answers.add("a");
        answers.add("a");

        rightAnswers.add("a");
        rightAnswers.add("a");
        rightAnswers.add("a");
        rightAnswers.add("a");
        boolean isWork = false;
        int conter = 0;
        for (int i = 0; i < arr.toArray().length; i++) {
            boolean ri = false;
            while (!ri && !isWork) {
                System.out.println(arr.get(i));

                Scanner temp = new Scanner(System.in);
                for (String str :
                        allAnswers) {
                    System.out.println(str);
                }
                String in = temp.next();
                if (answers.get(i).equals(in)) {
                    conter++;
                    ri = true;
                } else if (in.equals("q")) {
                    isWork = true;
                } else if (in.equals("1111")) {
                    for (String str :
                            rightAnswers) {
                        System.out.println(str);
                    }
                } else {
                    System.out.println("Error");
                }
            }
        }
        System.out.println(25 * conter);
    }
}