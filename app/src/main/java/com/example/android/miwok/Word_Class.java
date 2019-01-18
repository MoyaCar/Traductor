package com.example.android.miwok;

public class Word_Class {

    private String englishWord;
    private String miwokWord;

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public Word_Class(String englishWord, String miwokWord) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    @Override
    public String toString() {
        return "Word_Class{" +
                "englishWord='" + englishWord + '\'' +
                ", miwokWord='" + miwokWord + '\'' +
                '}';
    }
}
