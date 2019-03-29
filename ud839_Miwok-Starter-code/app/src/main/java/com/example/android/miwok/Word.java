package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResId;
    private int mAudioId;

    public Word( int audioId, String defaultTranslation, String miwokTranslation, int imageResId)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResId = imageResId;
        mAudioId = audioId;
    }

    public Word( int audioId, String defaultTranslation, String miwokTranslation)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioId = audioId;

    }

    public int getmAudioId(){return mAudioId;}

    public int getmImageResId() {
        return mImageResId;
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
