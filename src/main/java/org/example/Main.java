package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> rankList = new ArrayList<>() {{
            add(100);
            add(13);
            add(13);
            add(10);
            add(3);
            add(2);
            add(2);
            add(2);
        }};
        ArrayList<Integer> usedCards = new ArrayList<>() {{
            add(2);
            add(2);
            add(2);
        }};
        int remainingSlots = 2;
        Integer[] test = getRankListOfBestRemainingCards(usedCards,remainingSlots,rankList);
        for(Integer int1: test) {
            System.out.println(int1);
        }
    }

    public static Integer[] getRankListOfBestRemainingCards(ArrayList<Integer> usedCards, int remainingSlots, ArrayList<Integer> rankList) {
        ArrayList<Integer> placeholderList = new ArrayList<>();
        placeholderList.add(2);
        for (Integer rank : rankList) {
            if (!usedCards.contains(rank) && placeholderList.size()<remainingSlots+1) {
                placeholderList.add(rank);
            } else {
                usedCards.remove(rank);
            }
        }

        return placeholderList.toArray(new Integer[0]);
    }
}