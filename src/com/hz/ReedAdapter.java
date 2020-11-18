package com.hz;

import java.util.ArrayList;

public class ReedAdapter {
    private ArrayList<String> goodAnswers;

    public ReedAdapter () {
        this.goodAnswers = new ArrayList<String>();
    }

    public boolean adapt (String msg) {
        boolean included = false;
        for (String string : goodAnswers) {
            if (string.matches(msg)){
                included = true;
            }
        }
        return included;
    }

    public void addAnswers(ArrayList<String> newAnswers) {
        this.goodAnswers.addAll(newAnswers);
    }

    public void removeAnswer(String msg) {
        int i = 0;
        for (String string : goodAnswers) {
            if(string.matches(msg)){
                this.goodAnswers.remove(i);
            }
            i++;
        }
    }
}