package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String GetDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String GetMiwokTranslation()
    {
        return mMiwokTranslation;
    }
}
