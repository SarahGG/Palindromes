package com.company;

public class PalindromeLens {

    private int startIndex;
    private int endIndex;

    public PalindromeLens(String s) {
        startIndex = 0;

        if(s.length() == 0) {
            endIndex = 0;
        } else {
            endIndex = s.length() - 1;
        }
    }

    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }


    public int getEndIndex() {
        return endIndex;
    }
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
