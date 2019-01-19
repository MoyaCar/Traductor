package com.example.android.miwok;

public class Word_Class {

    private String englishWord;
    private String miwokWord;
    private int imageRes;

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageRes() {
        return imageRes;
    }


    public Word_Class(String englishWord, String miwokWord) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    public Word_Class(String englishWord, String miwokWord, int imageRes) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageRes = imageRes;
    }



    @Override
    public String toString() {
        return "Word_Class{" +
                "englishWord='" + englishWord + '\'' +
                ", miwokWord='" + miwokWord + '\'' +
                '}';
    }


}
