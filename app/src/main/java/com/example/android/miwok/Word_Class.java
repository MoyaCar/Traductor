package com.example.android.miwok;

public class Word_Class {

    private String englishWord;
    private String miwokWord;
    private int imageRes;
    private int mp3Sound;

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageRes() {
        return imageRes;
    }

    public int getMp3Sound() {
        return mp3Sound;
    }

    public Word_Class(String englishWord, String miwokWord, int imageRes, int mp3Sound) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageRes = imageRes;
        this.mp3Sound = mp3Sound;
    }

    public Word_Class(String englishWord, String miwokWord, int mp3Sound) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.mp3Sound = mp3Sound;
    }


    @Override
    public String toString() {
        return "Word_Class{" +
                "englishWord='" + englishWord + '\'' +
                ", miwokWord='" + miwokWord + '\'' +
                '}';
    }


}
