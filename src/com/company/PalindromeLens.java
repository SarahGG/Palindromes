package com.company;

public class PalindromeLens {

    private int startIndex;
    private int endIndex;
    private int palindromeSize;
    private int indexOffset;
    private int maxIndexOffset;

    public PalindromeLens(String s) {
        startIndex = 0;
        palindromeSize = s.length();
        indexOffset = 0;
        maxIndexOffset = (palindromeSize / 2) - 1;

        if(maxIndexOffset < 0) { maxIndexOffset = 0;}

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

    public int getPalindromeSize() {
        return palindromeSize;
    }
    public void setPalindromeSize(int palindromeSize) {
        this.palindromeSize = palindromeSize;
    }

    public int getIndexOffset() {
        return indexOffset;
    }
    public void setIndexOffset(int indexOffset) {
        this.indexOffset = indexOffset;
    }

    public int getMaxIndexOffset() {
        return maxIndexOffset;
    }
    public void setMaxIndexOffset(int maxIndexOffset) {
        this.maxIndexOffset = maxIndexOffset;
    }

    public void getSmaller() {
        palindromeSize--;
        endIndex = palindromeSize - 1;
    }
}
