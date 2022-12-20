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
            
        }};
    }

    public static ArrayList<Integer> getRankListOfBestRemainingCards(ArrayList<Integer> usedCards, int remainingSlots, ArrayList<Integer> rankList) {
        ArrayList<Integer> placeholderList = new ArrayList<>();
        for(Integer rank:rankList) {
            if(!usedCards.contains(rank)) {
                placeholderList.add(rank);
            } else {
                usedCards.remove(rank);
            }
        }
        for(int i = rankList.size(); i>remainingSlots; --i) {
            placeholderList.remove(i-1);
        }
        return placeholderList;
    }
}