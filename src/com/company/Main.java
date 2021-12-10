package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        printOddNums(nums);
        System.out.println();
        eventSort(nums);
        System.out.println();


        List<String> words = new ArrayList<>(List.of("Привет", "Пока", "Привет", "Как дела", "Спасибо"));
        printUnique(words);
        System.out.println();
        printDuplicatesCount(words);


    }

    public static void printOddNums(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        {
            for (Integer num : nums) {
                if (isOdd(num)) {
                    result.add(num);
                }
            }
            System.out.print("Нечетные : " + result);
        }
    }

    public static void eventSort(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        {
            for (Integer num : nums) {
                if (isEven(num)) {
                    result.add(num);
                }
            }
            System.out.print("Четные : " + result);
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printUnique(List<String> words) {
        List<String>words2 = new LinkedList<>(words);
        HashSet set = new HashSet(words2);
        words2.addAll(set);
            System.out.print(set);
        }

    public static void printDuplicatesCount(List<String> words){
                int count = 1;
                for(int i = 0; i < words.size(); i++){
                    for(int j = i+1; j < words.size(); j++) {
                        if(words.get(i).equals(words.get(j))) {
                            count ++;
                            words.remove(j);
                        }
                    }
                    if(count > 1) {
                        System.out.print(words.get(i) + count);
                        words.remove(i);
                        count = 1;
                    }
                }
            }


}










